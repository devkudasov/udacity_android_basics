/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kudasov.dev.eqrthquake;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import com.kudasov.dev.eqrthquake.adapters.EarthquakeAdapter;
import com.kudasov.dev.eqrthquake.loaders.EarthquakeLoader;
import com.kudasov.dev.eqrthquake.models.Earthquake;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<Earthquake>> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        getSupportLoaderManager().initLoader(1, null, this).forceLoad();
    }

    private void updateUI(ArrayList<Earthquake> earthquakes) {
        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);
        earthquakeListView.setAdapter(adapter);
    }

    @NonNull
    @Override
    public Loader<ArrayList<Earthquake>> onCreateLoader(int id, @Nullable Bundle args) {
        return new EarthquakeLoader(EarthquakeActivity.this);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<ArrayList<Earthquake>> loader, ArrayList<Earthquake> data) {
        updateUI(data);
    }

    @Override
    public void onLoaderReset(@NonNull Loader<ArrayList<Earthquake>> loader) {
        updateUI(new ArrayList<>());
    }
}
