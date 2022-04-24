package com.example.appgamenft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class GameAdapter extends BaseAdapter {

    private List<Game> list;
    private Context context;

    public GameAdapter(Context context, List<Game> list){
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list_game, parent, false);
        }

        TextView tvGameName;
        tvGameName = convertView.findViewById(R.id.tvGameName);
        tvGameName.setText(list.get(position).getGameName());

        ImageView imgGame;
        imgGame = convertView.findViewById(R.id.imgGame);
        if(list.get(position).getImgGame() != null && !list.get(position).getImgGame().isEmpty()){
            Glide.with(context).load(list.get(position).getImgGame()).into(imgGame);
        }

        return convertView;
    }
}
