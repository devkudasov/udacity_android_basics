package com.kudasov.dev.miwok;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mBackgroundColorResourceID;
    public WordAdapter(Activity activity, ArrayList<Word> words, int backgroundColorResourceID) {
        super(activity, 0, words);

        mBackgroundColorResourceID = backgroundColorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.word_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_word);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.english_word);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        int imageId = currentWord.getImageResourceID();
        ImageView imageView = listItemView.findViewById(R.id.word_image);

        if (imageId != 0) {
            imageView.setImageResource(imageId);
        } else {
            imageView.setVisibility(View.GONE);
        }

        LinearLayout linearLayout = listItemView.findViewById(R.id.words);
        linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), mBackgroundColorResourceID));

        return listItemView;
    }
}
