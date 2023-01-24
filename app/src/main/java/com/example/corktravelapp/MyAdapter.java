package com.example.corktravelapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Location> myImageList;
    private LayoutInflater myInflater;
    private ItemClickListener myClickListener;

    public MyAdapter(PubActivity context, List<Location> myImageList){
        this.myImageList = myImageList;
        this.myInflater = LayoutInflater.from(context);

    }

    void setClickListener(ItemClickListener itemClickListener){
        this.myClickListener = itemClickListener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = myInflater.inflate(R.layout.recycler_row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.myImageView.setImageResource(myImageList.get(position).image);
        holder.textView.setText(myImageList.get(position).name);
    }

    @Override
    public int getItemCount() {
        return myImageList.size();
    }

    Integer getItem(int id){
        return myImageList.get(id).image;
    }

    public interface ItemClickListener{
        void onItemClick(View view, int position);

    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView myImageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            myImageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView2);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (myClickListener != null) myClickListener.onItemClick(view,getAdapterPosition());

        }

    }

}
