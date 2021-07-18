package com.example.glowstore.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.glowstore.R;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout profil, home, skincare, bodycare, cosmetic, serum, spot_treatment, paket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profil = (LinearLayout) findViewById(R.id.profil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(MainActivity.this,profil.class);
               startActivity(i);
            }
        });

        home = (LinearLayout) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        skincare = (LinearLayout) findViewById(R.id.skincare);
        skincare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,skincare.class);
                startActivity(i);
            }
        });

        bodycare = (LinearLayout) findViewById(R.id.bodycare);
        bodycare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,bodycare.class);
                startActivity(i);
            }
        });

        cosmetic = (LinearLayout) findViewById(R.id.cosmetic);
        cosmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,cosmetic.class);
                startActivity(i);
            }
        });

        serum = (LinearLayout) findViewById(R.id.serum);
        serum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,serum.class);
                startActivity(i);
            }
        });

        spot_treatment = (LinearLayout) findViewById(R.id.spot_treatment);
        spot_treatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,spot_treatment.class);
                startActivity(i);
            }
        });

        paket = (LinearLayout) findViewById(R.id.paket);
        paket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,paket.class);
                startActivity(i);
            }
        });

    }

}

