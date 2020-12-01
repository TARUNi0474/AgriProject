package com.example.agriproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.HoldView> {
    Context ct;
    // Inflate the layout for this fragment
    String name[];
    int images[];

    public MyAdapter(Context ct, String[] name, int[] images) {
        this.ct = ct;
        this.name = name;
        this.images = images;
    }

    @NonNull
    @Override
    public HoldView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HoldView(LayoutInflater.from(ct).inflate(R.layout.row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HoldView holder, int position) {
        holder.iv.setImageResource(images[position]);
        holder.tv.setText(name[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class HoldView extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;
        public HoldView(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tv=itemView.findViewById(R.id.title);
        }
    }
}
