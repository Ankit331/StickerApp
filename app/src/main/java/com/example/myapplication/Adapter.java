package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>
{
    ArrayList<StickerModel> stickerArrayList;
    Context context;

    public Adapter(ArrayList<StickerModel> stickerArrayList, Context context) {
        this.stickerArrayList = stickerArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        context= parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View stickerView= layoutInflater.inflate(R.layout.row_item,parent,false);
        return new Adapter.ViewHolder(stickerView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        StickerModel stickerModel=stickerArrayList.get(position);
        holder.stickerImage.setBackgroundResource(stickerModel.getStickerId());
    }

    @Override
    public int getItemCount() {
        return stickerArrayList.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder
    {
        ImageView stickerImage;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            stickerImage=itemView.findViewById(R.id.image);
        }
    }
}
