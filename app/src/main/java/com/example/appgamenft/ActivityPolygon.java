package com.example.appgamenft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivityPolygon extends AppCompatActivity implements View.OnClickListener {

    private ListView lvList;
    private GameAdapter adapter;
    private TextView tvAll, tvBSC, tvEtherium, tvPolygon;
    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polygon);

        lvList = findViewById(R.id.lvListGame);

        List<Game> list = new ArrayList<>();
        list.add(new Game("https://gfsblockchain.com/wp-content/uploads/2021/09/tong-quan-ghst.jpg","Aavegotchi"));
        list.add(new Game("https://yt3.ggpht.com/5IdayuWj4r0oF_d3RGfKFegQ3YpYBYGmnfYzrKtGbJOmgnwmoiOj86qJJZu4QuBKevM0NKT0bQ=s900-c-k-c0x00ffffff-no-rj","Idle Mystic"));
        list.add(new Game("https://assets.coingecko.com/coins/images/19305/large/Logo_200x200_%281%29.png?1634972378","Pegaxy"));
        list.add(new Game("https://pbs.twimg.com/profile_images/1425007286401912835/Lf5aQcxz_400x400.jpg","Tiny Hero"));
        adapter = new GameAdapter(ActivityPolygon.this, list);

        lvList.setAdapter(adapter);

        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent Aavegotchi = new Intent(ActivityPolygon.this , com.example.appgamenft.detailgame.Aavegotchi.class);
                        startActivity(Aavegotchi);
                        break;
                    case 1:
                        Intent Idle = new Intent(ActivityPolygon.this , com.example.appgamenft.detailgame.IdleMystic.class);
                        startActivity(Idle);
                        break;
                    case 2:
                        Intent Pegaxy = new Intent(ActivityPolygon.this , com.example.appgamenft.detailgame.Pegaxy.class);
                        startActivity(Pegaxy);
                        break;
                    case 3:
                        Intent Tiny = new Intent(ActivityPolygon.this , com.example.appgamenft.detailgame.TinyHero.class);
                        startActivity(Tiny);
                        break;

                }

            }
        });

        tvAll = findViewById(R.id.tvAll);
        tvBSC = findViewById(R.id.tvBSC);
        tvEtherium = findViewById(R.id.tvEtherium);
        tvPolygon = findViewById(R.id.tvPolygon);

        tvAll.setOnClickListener(this);
        tvBSC.setOnClickListener(this);
        tvEtherium.setOnClickListener(this);
        tvPolygon.setOnClickListener(this);

        logo = findViewById(R.id.Logo);
        logo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvAll:
                Intent All = new Intent(ActivityPolygon.this, ActivityAllGame.class);
                startActivity(All);
                break;
            case R.id.tvBSC:
                Intent BSC = new Intent(ActivityPolygon.this, ActivityBSC.class);
                startActivity(BSC);
                break;
            case R.id.tvEtherium:
                Intent Ehterium = new Intent(ActivityPolygon.this, ActivityEtherium.class);
                startActivity(Ehterium);
                break;
            case R.id.tvPolygon:
                Toast.makeText(ActivityPolygon.this, "Polygon Games", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Logo:
                Intent main = new Intent(ActivityPolygon.this, MainActivity.class);
                startActivity(main);
                break;
        }
    }
}