package com.gokhan.calismayapisiodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gokhan.calismayapisiodev.databinding.ActivityXsayfasiBinding;
import com.google.android.material.snackbar.Snackbar;

public class XsayfasiActivity extends AppCompatActivity {
    private ActivityXsayfasiBinding xSayfasiTasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        xSayfasiTasarim = ActivityXsayfasiBinding.inflate(getLayoutInflater());
        setContentView(xSayfasiTasarim.getRoot());
    }

    @Override
    public void onBackPressed(){
        Snackbar.make(xSayfasiTasarim.textView3,"Ana Sayfaya Dön",Snackbar.LENGTH_LONG)
                .setAction("Evet" ,view -> {
                    Intent bIntent = new Intent(XsayfasiActivity.this,MainActivity.class);
                    startActivity(bIntent);
                })
                .show();

    }
}