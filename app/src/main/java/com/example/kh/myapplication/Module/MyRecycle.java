package com.example.kh.myapplication.Module;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kh.myapplication.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by kh on 5/16/2017.
 */

public class MyRecycle extends RecyclerView.Adapter<MyRecycle.MyViewHolder> {
    private LayoutInflater inflater;
    List<Information> data = Collections.emptyList();
    public MyRecycle(Context context, List<Information> data){

        this.data  =data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row,parent, false);
        MyViewHolder holder  = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Information current  = data.get(position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.icon);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
  public  class MyViewHolder extends RecyclerView.ViewHolder {
      TextView title;
      ImageView icon;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.txtTitle);
            icon = (ImageView) itemView.findViewById(R.id.imIcon);
        }
    }
}

