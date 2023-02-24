package com.example.lipstick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Character> mData;
    private OnItemClickListener listener;

    public MyAdapter(List<Character> character , OnItemClickListener listener) {
        this.mData =character;
        this.listener=listener;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_lipstick, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Character c = mData.get(position);
        if(c == null)
            return;
        holder.mImageV.setImageResource(c.getId());
        holder.mTextV.setText(c.getName());
        holder.mContentV.setText(c.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener !=null)
                    listener.onItemClick(c);
            }
        });


    }


    @Override
    public int getItemCount() {
        if(mData !=null)
            return mData.size();
        return 0;
    }

    public interface OnItemClickListener {
        void onItemClick(Character character);
    }
}
