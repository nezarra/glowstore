package com.example.glowstore.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.glowstore.R;

public class profil extends AppCompatActivity {

    private LinearLayout profil, home, transaksi, pengiriman, ubah_profil, hubungi_admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        profil = (LinearLayout) findViewById(R.id.profil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(profil.this,profil.class);
                startActivity(i);
            }
        });

        home = (LinearLayout) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(profil.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}