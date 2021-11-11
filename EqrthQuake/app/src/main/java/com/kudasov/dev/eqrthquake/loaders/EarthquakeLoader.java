package com.kudasov.dev.eqrthquake.loaders;

import android.content.Context;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import com.kudasov.dev.eqrthquake.EarthquakeActivity;
import com.kudasov.dev.eqrthquake.models.Earthquake;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class EarthquakeLoader extends AsyncTaskLoader<ArrayList<Earthquake>> {

    private static final String REQUEST_URL =
            "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&eventtype=earthquake&orderby=time&minmag=6&limit=10";

    public static final String LOG_TAG = EarthquakeActivity.class.getSimpleName();

    private static final String FEATURES_KEY = "features";
    private static final String PROPERTIES_KEY = "properties";
    private static final String MAGNITUDE_KEY = "mag";
    private static final String LOCATION_KEY = "place";
    private static final String DATE_KEY = "time";
    private static final String URL_KEY = "url";

    public EarthquakeLoader(Context context) {
        super(context);
    }

    @Nullable
    @Override
    public ArrayList<Earthquake> loadInBackground() {
        URL url = createUrl(REQUEST_URL);

        String jsonResponse = "";
        try {
            jsonResponse = makeHttpRequest(url);
        } catch (IOException e) {
            // TODO Handle the IOException
        }

        return extractFeatureFromJson(jsonResponse);
    }

    private URL createUrl(String stringUrl) {
        URL url = null;
        try {
            url = new URL(stringUrl);
        } catch (MalformedURLException exception) {
            Log.e(LOG_TAG, "Error with creating URL", exception);
            return null;
        }
        return url;
    }

    private String makeHttpRequest(URL url) throws IOException {
        String jsonResponse = "";
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(10000 /* milliseconds */);
            urlConnection.setConnectTimeout(15000 /* milliseconds */);
            urlConnection.connect();

            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                inputStream = urlConnection.getInputStream();
                jsonResponse = readFromStream(inputStream);
            } else {
                Log.e(LOG_TAG, "Response code -> " + urlConnection.getResponseCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (inputStream != null) {
                // function must handle java.io.IOException here
                inputStream.close();
            }
        }
        return jsonResponse;
    }

    private String readFromStream(InputStream inputStream) throws IOException {
        StringBuilder output = new StringBuilder();
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null) {
                output.append(line);
                line = reader.readLine();
            }
        }
        return output.toString();
    }

    private ArrayList<Earthquake> extractFeatureFromJson(String earthquakeJSON) {
        ArrayList<Earthquake> earthquakes = new ArrayList<>();

        // Try to parse the SAMPLE_JSON_RESPONSE. If there's a problem with the way the JSON
        // is formatted, a JSONException exception object will be thrown.
        // Catch the exception so the app doesn't crash, and print the error message to the logs.
        try {
            JSONObject root = new JSONObject(earthquakeJSON);
            JSONArray features = root.getJSONArray(FEATURES_KEY);

            for (int i = 0; i < features.length(); i++) {
                JSONObject feature = features.getJSONObject(i);
                JSONObject properties = feature.getJSONObject(PROPERTIES_KEY);

                earthquakes.add(new Earthquake(
                        properties.getDouble(MAGNITUDE_KEY),
                        properties.getString(LOCATION_KEY),
                        properties.getLong(DATE_KEY),
                        properties.getString(URL_KEY)
                ));
            }

        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.
            Log.e("QueryUtils", "Problem parsing the earthquake JSON results", e);
        }

        // Return the list of earthquakes
        return earthquakes;
    }
}
