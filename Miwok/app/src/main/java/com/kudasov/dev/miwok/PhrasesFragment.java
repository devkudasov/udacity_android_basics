package com.kudasov.dev.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesFragment extends Fragment {

    private MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;

    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = (focusChange) -> {
        if (mMediaPlayer == null) {
            return;
        }

        if (focusChange == AudioManager.AUDIOFOCUS_GAIN_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
            mMediaPlayer.pause();
            mMediaPlayer.seekTo(0);
        } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
            mMediaPlayer.start();
        } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
            releaseMediaPlayer();
        }
    };

    public PhrasesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        mAudioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        words.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));

        WordAdapter wordsAdapter = new WordAdapter(getActivity(), words, R.color.category_phrases);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(wordsAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            int audioRequestResult = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

            if (audioRequestResult == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(getActivity(), words.get(position).getSoundResourceID());
                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener((mediaPlayer) -> {
                    releaseMediaPlayer();
                });
            }
        });

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;

            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
}