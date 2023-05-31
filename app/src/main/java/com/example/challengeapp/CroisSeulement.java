package com.example.challengeapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.challengeapp.Adapters.SongAdapter;
import com.example.challengeapp.datasource.DataSource;

import java.util.ArrayList;
import java.util.List;

public class CroisSeulement extends AppCompatActivity {
    ListView listViewCroisSeulement;
    DataSource dataSource;
    ArrayList<Song> songsItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crois_seulement);

        // on instancie la classe qui contient les tableaux des titres de toutes les chansons
        dataSource = new DataSource();
        // recuperer la listview
        listViewCroisSeulement = findViewById(R.id.listViewCroisSeulement);
        songsItemArrayList = new ArrayList<>();

        ActionBar ar = getSupportActionBar();
        if (ar != null) {
            ar.setTitle("Crois seulement");
        }

        int i;
        for(i = 0; i<= 225; i++){
            songsItemArrayList.add(new Song(i+1, i+1 +". "+ dataSource.getTitreCroisSeulement()[i], dataSource.getDataMusic()));
        }
        SongAdapter songAdapter = new SongAdapter(this, R.layout.song_row, songsItemArrayList);
        listViewCroisSeulement.setAdapter(songAdapter);

    }
}