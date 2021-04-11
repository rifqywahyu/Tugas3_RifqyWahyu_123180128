package com.example.tugas3_rifqywahyu_123180128;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ArtikelAdapter extends RecyclerView.Adapter<ArtikelAdapter.ViewHolder> {

    private Context context;
    private ArrayList<ArtikelModel> artikelModels;

    public ArtikelAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<ArtikelModel> getArtikelModels() {
        return artikelModels;
    }

    public void setArtikelModels(ArrayList<ArtikelModel> artikelModels) {
        this.artikelModels = artikelModels;
    }

    @NonNull
    @Override
    public ArtikelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from((viewGroup.getContext())).
                inflate(R.layout.item_artikel,viewGroup, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtikelAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getArtikelModels().get(i).getGambarArtikel()).into(viewHolder.ivGambarArtikel);
        viewHolder.tvKategoriArtikel.setText(getArtikelModels().get(i).getKategoriArtikel());

        viewHolder.btnArtikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ArtikelDetail.class);
                intent.putExtra("image", getArtikelModels().get(i).getGambarArtikel());
                intent.putExtra("name", getArtikelModels().get(i).getKategoriArtikel());
                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return getArtikelModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivGambarArtikel;
        private TextView tvKategoriArtikel;
        private Button btnArtikel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivGambarArtikel = itemView.findViewById(R.id.gambar_artikel);
            tvKategoriArtikel = itemView.findViewById(R.id.kategori_artikel);
            btnArtikel = itemView.findViewById(R.id.button_artikel);
        }
    }
}


