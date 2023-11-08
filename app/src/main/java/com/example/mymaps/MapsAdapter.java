package com.example.mymaps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Map;

import Model.Place;
import Model.UserMap;

public class MapsAdapter extends RecyclerView.Adapter<MapsAdapter.viewHolder> {
    Context context;
    List<UserMap> userMaps;

    public MapsAdapter(Context context,List<UserMap> userMaps){
        this.context = context;
        this.userMaps = userMaps;
    }

    @NonNull
    @Override
    public MapsAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View map = inflater.inflate(android.R.layout.simple_list_item_1,parent,false);
        viewHolder viewholder = new viewHolder(map);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
              UserMap map = userMaps.get(position);
              TextView textViewTitle = (TextView)holder.itemView.findViewById(android.R.id.text1);
              textViewTitle.setText(map.getTitle());
    }

    @Override
    public int getItemCount() {
        return userMaps.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
