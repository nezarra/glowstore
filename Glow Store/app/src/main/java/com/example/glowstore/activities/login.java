package com.example.glowstore.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.glowstore.R;

public class login extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.login);

         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent1 = new Intent(com.example.glowstore.activities.login.this.getApplicationContext(), MainActivity.class);
                 com.example.glowstore.activities.login.this.startActivity(intent1);
             }
         });
    }
}