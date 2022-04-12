package com.gokhan.calismayapisiodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gokhan.calismayapisiodev.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarimMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarimMain = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarimMain.getRoot());

        tasarimMain.aButton.setOnClickListener(view -> {
            Intent aIntent = new Intent(MainActivity.this,AsayfasiActivity.class);
            startActivity(aIntent);
        });

        tasarimMain.yButton.setOnClickListener(view -> {
            Intent yIntent = new Intent(MainActivity.this,YsayfasiActivity.class);
            startActivity(yIntent);
        });

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}