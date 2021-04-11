package com.example.tugas3_rifqywahyu_123180128;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvGambar;
    private ArrayList<ArtikelModel> listGambar = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGambar = findViewById(R.id.rv_gambar_list);
        rvGambar.setHasFixedSize(true);
        listGambar.addAll(ArtikelData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvGambar.setLayoutManager(new LinearLayoutManager(this));
        ArtikelAdapter artikelAdapter = new ArtikelAdapter(this);
        artikelAdapter.setArtikelModels(listGambar);
        rvGambar.setAdapter(artikelAdapter);
    }
}