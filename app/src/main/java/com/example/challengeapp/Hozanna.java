package com.example.challengeapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.challengeapp.Adapters.SongAdapter;
import com.example.challengeapp.beans.Song;
import com.example.challengeapp.datasource.DataSource;

import java.util.ArrayList;

public class Hozanna extends AppCompatActivity {
    ListView listViewHozanna;
    DataSource dataSource;
    ArrayList<Song> songsItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hozanna);

        // on instancie la classe qui contient les tableaux des titres de toutes les chansons
        dataSource = new DataSource();
        // recuperer la listview
        listViewHozanna = findViewById(R.id.listViewHozanna);
        songsItemArrayList = new ArrayList<>();

        ActionBar ar = getSupportActionBar();
        if (ar != null) {
            ar.setTitle("Hozanna");
        }

        int i;
        for(i = 0; i<= 35; i++){
            songsItemArrayList.add(new Song(i+1, i+1 +". "+ dataSource.getHozannaTitre()[i], dataSource.getDataMusic()));
        }
        SongAdapter songAdapter = new SongAdapter(this, R.layout.song_row, songsItemArrayList);
        listViewHozanna.setAdapter(songAdapter);

        listViewHozanna.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ChantActivity.class);
                //intent.putExtra("titre", dataSource.getTitre()[i]);
                //intent.putExtra("data_music", R.string.vieuxLoup);
                startActivity(intent);
            }
        });
    }
}