package com.example.lipstick;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView mImageV;
    public TextView mTextV;
    public TextView mContentV;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mImageV = itemView.findViewById(R.id.img);
        mTextV =itemView.findViewById(R.id.title);
        mContentV=itemView.findViewById(R.id.content);


    }
}
