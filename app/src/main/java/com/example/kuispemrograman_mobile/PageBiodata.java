package com.example.kuispemrograman_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.kuispemrograman_mobile.MainActivity.logout;

public class PageBiodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_biodata);
    }

    public void Back(View view) {
        startActivity(new Intent(PageBiodata.this,MainActivity.class));
    }

    public void Keluar(View view) {
        logout(this);
    }
}