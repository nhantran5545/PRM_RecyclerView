package com.example.recyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AdapterRecyclerView  extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    ArrayList<ItemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textTen;
        TextView textNam;
        ImageView posterFilm;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textTen = itemView.findViewById(R.id.text_phim);
            textNam = itemView.findViewById(R.id.text_year);
            posterFilm = itemView.findViewById(R.id.image_poster);
        }
    }

    AdapterRecyclerView(ArrayList<ItemModel> data) {
        this.dataItem =data;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {
        TextView text_phim = holder.textTen;
        TextView text_nam = holder.textNam;
        ImageView image_poster = holder.posterFilm;

        text_phim.setText(dataItem.get(position).getName());
        text_nam.setText(dataItem.get(position).getYear());
        image_poster.setImageResource(dataItem.get(position).getPoster());

        // Xử lý sự kiện nhấn vào item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo intent
                Intent intent = new Intent(v.getContext(), MovieDetailsActivity.class);

                // Truyền dữ liệu của phim vào intent
                intent.putExtra("name", dataItem.get(position).getName());
                intent.putExtra("year", dataItem.get(position).getYear());
                intent.putExtra("poster", dataItem.get(position).getPoster());

                // Khởi chạy activity MovieDetailsActivity
                v.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}
