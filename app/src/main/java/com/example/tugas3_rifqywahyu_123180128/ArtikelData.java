package com.example.tugas3_rifqywahyu_123180128;

import java.util.ArrayList;

public class ArtikelData {
    private static String[] title = new String[] {"Business", "Lifestyle", "Health", "Entertainment", "Opinion"};
    private static int[] thumbnail = new int[]{R.drawable.business, R.drawable.lifestyle, R.drawable.health, R.drawable.entertainment, R.drawable.opinion};

    public static ArrayList<ArtikelModel> getListData() {
        ArtikelModel artikelModel = null;
        ArrayList<ArtikelModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            artikelModel = new ArtikelModel();
            artikelModel.setGambarArtikel(thumbnail[i]);
            artikelModel.setKategoriArtikel(title[i]);
            list.add(artikelModel);
        }
        return list;
    }
}
