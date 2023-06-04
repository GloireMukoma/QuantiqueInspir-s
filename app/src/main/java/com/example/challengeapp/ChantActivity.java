package com.example.challengeapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.challengeapp.beans.MusicPlayer;

import java.util.concurrent.TimeUnit;

public class ChantActivity extends AppCompatActivity {
    private MusicPlayer musicPlayer;
    private Uri soundUri; // L'URI du fichier audio à lire
    private Button playButton, pauseButton;
    private SeekBar seekBar;
    private TextView counterTextView, durationTextView;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chant);
        // Récupérer les données passées depuis l'activité précédente
        Bundle extras = getIntent().getExtras();
        String titre = extras.getString("titre");

        ActionBar ar = getSupportActionBar();
        if (ar != null) {
            ar.setTitle(titre);
        }

        musicPlayer = new MusicPlayer();
        soundUri = Uri.parse("android.resource://com.example.challengeapp/raw/song");

        seekBar = findViewById(R.id.seekBar);
        durationTextView = findViewById(R.id.durationTextView);
        durationTextView = findViewById(R.id.durationTextView);
        counterTextView = findViewById(R.id.counterTextView);
        playButton = findViewById(R.id.button_play);
        pauseButton = findViewById(R.id.button_pause);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.playSound(ChantActivity.this, soundUri, seekBar, durationTextView);
                startCounter();
            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pauseSound();
                stopCounter();
            }
        });
    }

    private void startCounter() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                int currentPosition = musicPlayer.getCurrentPosition();
                counterTextView.setText(formatDuration(currentPosition));
                handler.postDelayed(this, 1000);
            }
        };
        handler.postDelayed(runnable, 1000);
    }

    private void stopCounter() {
        if (handler != null && runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }

    private String formatDuration(int duration) {
        long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(duration) -
                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration));
        return String.format("%02d:%02d", minutes, seconds);
    }

}