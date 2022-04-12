package com.gokhan.calismayapisiodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gokhan.calismayapisiodev.databinding.ActivityYsayfasiBinding;

public class YsayfasiActivity extends AppCompatActivity {
    private ActivityYsayfasiBinding ySayfasiTasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ySayfasiTasarim = ActivityYsayfasiBinding.inflate(getLayoutInflater());
        setContentView(ySayfasiTasarim.getRoot());

        ySayfasiTasarim.button.setOnClickListener(view -> {
            Intent xIntent = new Intent(YsayfasiActivity.this,XsayfasiActivity.class);
            startActivity(xIntent);
        });
    }
}