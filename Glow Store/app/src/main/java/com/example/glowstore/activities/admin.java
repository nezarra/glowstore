package com.example.glowstore.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.example.glowstore.R;

public class admin extends AppCompatActivity {

    private LinearLayout pesanan_masuk, pesanan_selesai, stok_produk, edit_produk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        //PINDAH
        pesanan_masuk = (LinearLayout) findViewById(R.id.pesanan_masuk);
        pesanan_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(admin.this,pesanan_masuk.class);
                startActivity(i);
            }
        });

        pesanan_selesai = (LinearLayout) findViewById(R.id.pesanan_selesai);
        pesanan_selesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(admin.this,pesanan_selesai.class);
                startActivity(i);
            }
        });

        stok_produk = (LinearLayout) findViewById(R.id.stok_produk);
        stok_produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(admin.this,stok_produk.class);
                startActivity(i);
            }
        });

        edit_produk = (LinearLayout) findViewById(R.id.edit_produk);
        edit_produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(admin.this,edit_produk.class);
                startActivity(i);
            }
        });

    }
}