package com.example.viewpager2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HorizontalVpAdapter extends RecyclerView.Adapter<HorizontalViewHolder> {
    private List<Integer> backgrounds;
    private Context mcontext;
    public HorizontalVpAdapter(List<Integer> list){
        this.backgrounds=list;
    }
    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        HorizontalViewHolder horizontalViewHolder=new HorizontalViewHolder(v);
        return horizontalViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
         int backColor = backgrounds.get(position);
         holder.itemImage.setImageResource(backColor);
    }

    @Override
    public int getItemCount() {
        if(backgrounds==null){
            return 0;
        }else{
            return backgrounds.size();
        }
    }
}
class HorizontalViewHolder extends RecyclerView.ViewHolder{

    ImageView itemImage;
    public HorizontalViewHolder(@NonNull View itemView) {
        super(itemView);
        itemImage=itemView.findViewById(R.id.item_image);
    }
}
