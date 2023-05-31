package com.example.challengeapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.challengeapp.Song;
import com.example.challengeapp.R;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    private Context mContext;
    private int mResource;

    public SongAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Song> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(mResource, parent, false);
        }

        TextView titre = convertView.findViewById(R.id.item_titre_music);
        titre.setText(getItem(position).getNom());

        return convertView;
    }
}
