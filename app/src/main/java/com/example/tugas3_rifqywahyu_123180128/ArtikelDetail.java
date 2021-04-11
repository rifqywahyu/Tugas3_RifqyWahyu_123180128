package com.example.tugas3_rifqywahyu_123180128;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ArtikelDetail extends AppCompatActivity {

    private TextView tvKategori;
    private ImageView ivGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_artikels);

        tvKategori = findViewById(R.id.kategori_artikel_detail);
        ivGambar = findViewById(R.id.gambar_artikel_detail);

        tvKategori.setText(getIntent().getStringExtra("name"));

        Glide.with(getApplicationContext()).load(getIntent().getStringExtra("image")).into(ivGambar);

    }
}