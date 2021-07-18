package com.example.glowstore.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.glowstore.R;

public class spot_treatment extends AppCompatActivity {

    private LinearLayout profil, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot_treatment);

        profil = (LinearLayout) findViewById(R.id.profil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(spot_treatment.this,profil.class);
                startActivity(i);
            }
        });

        home = (LinearLayout) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(spot_treatment.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}