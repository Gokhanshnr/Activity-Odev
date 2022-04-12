package com.gokhan.calismayapisiodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gokhan.calismayapisiodev.databinding.ActivityAsayfasiBinding;

public class AsayfasiActivity extends AppCompatActivity {
    private ActivityAsayfasiBinding aSayfasiTasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        aSayfasiTasarim = ActivityAsayfasiBinding.inflate(getLayoutInflater());
        setContentView(aSayfasiTasarim.getRoot());

        aSayfasiTasarim.button.setOnClickListener(view -> {
            Intent bIntent = new Intent(AsayfasiActivity.this,BsayfasiActivity.class);
            startActivity(bIntent);
        });
    }
}