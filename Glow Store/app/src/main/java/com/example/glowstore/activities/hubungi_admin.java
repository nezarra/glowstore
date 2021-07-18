package com.example.glowstore.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.glowstore.R;

public class hubungi_admin extends AppCompatActivity {

    private LinearLayout profil, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hubungi_admin);

        profil = (LinearLayout) findViewById(R.id.profil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hubungi_admin.this,profil.class);
                startActivity(i);
            }
        });

        home = (LinearLayout) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hubungi_admin.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}