package com.example.challengeapp.beans;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MusicPlayer {
    private MediaPlayer mediaPlayer;
    private Handler handler;
    private Runnable runnable;

    public void playSound(Context context, Uri soundUri, final SeekBar seekBar, final TextView durationTextView) {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }

        mediaPlayer = MediaPlayer.create(context, soundUri);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                seekBar.setMax(mediaPlayer.getDuration());
                updateSeekBar(seekBar, durationTextView);
                mediaPlayer.start();
            }
        });

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                updateSeekBar(seekBar, durationTextView);
                handler.postDelayed(this, 1000);
            }
        };

        handler.postDelayed(runnable, 1000);
    }

    public void pauseSound() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

    public int getCurrentPosition() {
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    private void updateSeekBar(SeekBar seekBar, TextView durationTextView) {
        seekBar.setProgress(mediaPlayer.getCurrentPosition());
        durationTextView.setText(formatDuration(mediaPlayer.getDuration()));
    }

    private String formatDuration(int duration) {
        long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(duration) -
                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration));
        return String.format("%02d:%02d", minutes, seconds);
    }
}



