package com.example.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.ArrayList;

public class CardviewAdapter extends RecyclerView.Adapter<CardviewAdapter.DesignViewHolder> {
        ArrayList<CardviewData> CardviewDatas;


//this will hold the Data
public CardviewAdapter(ArrayList<CardviewData> CardviewDatas) {
        this.CardviewDatas = CardviewDatas;
        }

@NonNull
@Override
public DesignViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewdesign,parent,false);
        DesignViewHolder DesignViewHolder=new DesignViewHolder(view);

        return DesignViewHolder;
        }


    @Override
public void onBindViewHolder(@NonNull DesignViewHolder holder, int position) {
        //main function to bind the design
        //pass down the position
        CardviewData CardviewData= CardviewDatas.get(position);
        //set the image
        holder.iv_card.setImageResource(CardviewData.getPhoto());
        holder.tv_detail.setText(CardviewData.getDetails());
        }

@Override
public int getItemCount() {
        return CardviewDatas.size();
        }

//this will hold the View Design
public static class DesignViewHolder extends RecyclerView.ViewHolder{
    ImageView iv_card;
    TextView tv_detail;

    public DesignViewHolder(@NonNull View itemView) {
        super(itemView);

        //Hooks
        iv_card=itemView.findViewById(R.id.iv_card);
        tv_detail=itemView.findViewById(R.id.tv_detail);


    }
}


}