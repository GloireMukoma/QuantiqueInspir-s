package com.example.challengeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button croisseulement;
    Button hozanna;
    Button autreqtiqu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        croisseulement = findViewById(R.id.croisseulementbtn);
        hozanna = findViewById(R.id.hozannabtn);
        autreqtiqu = findViewById(R.id.autrecantiqbtn);

        croisseulement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CroisSeulement.class);
                startActivity(intent);

            }
        });
        hozanna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Hozanna.class);
                startActivity(intent);

            }
        });
        autreqtiqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AutreCantique.class);
                startActivity(intent);

            }
        });
    }
}