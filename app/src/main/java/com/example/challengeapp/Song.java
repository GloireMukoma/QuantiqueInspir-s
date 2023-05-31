package com.example.challengeapp;

public class Song {
    private int id;
    private String titre;
    private String dataMusic;

    public Song(int id, String nom, String dataMusic) {
        this.id = id;
        this.titre = nom;
        this.dataMusic = dataMusic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return titre;
    }

    public void setNom(String nom) {
        this.titre = nom;
    }

    public String getDataMusic() {
        return dataMusic;
    }

    public void setDataMusic(String dataMusic) {
        this.dataMusic = dataMusic;
    }
}
