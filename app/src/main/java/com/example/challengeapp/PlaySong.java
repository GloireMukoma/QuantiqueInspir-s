package com.example.challengeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class PlaySong extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        //TextView titreTextView = findViewById(R.id.titre_text_view);

            // Récupérer les données passées depuis l'activité précédente
            /*Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String titre = extras.getString("titre");
                int dataMusic = extras.getInt("data_music");

                //titreTextView.setText(titre);

                // Lecture de l'audio
                mediaPlayer = MediaPlayer.create(this, dataMusic);
                mediaPlayer.start();
            }*/
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();

            // Arrêter et libérer le MediaPlayer lorsque l'activité est détruite
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
        }
}