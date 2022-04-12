package com.gokhan.calismayapisiodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gokhan.calismayapisiodev.databinding.ActivityBsayfasiBinding;

public class BsayfasiActivity extends AppCompatActivity {
    private ActivityBsayfasiBinding bSayfasiTasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bSayfasiTasarim = ActivityBsayfasiBinding.inflate(getLayoutInflater());
        setContentView(bSayfasiTasarim.getRoot());

        bSayfasiTasarim.button.setOnClickListener(view -> {
            Intent xIntent = new Intent(BsayfasiActivity.this,XsayfasiActivity.class);
            startActivity(xIntent);
        });
    }

}