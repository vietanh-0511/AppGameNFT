package com.example.appgamenft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivityBSC extends AppCompatActivity implements View.OnClickListener {

    private ListView lvList;
    private GameAdapter adapter;
    private TextView tvAll, tvBSC, tvEtherium, tvPolygon;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc);

        lvList = findViewById(R.id.lvListGame);

        List<Game> list = new ArrayList<>();
        list.add(new Game("https://pbs.twimg.com/profile_images/1454114449196003334/ptrtm5Yj_400x400.jpg","Axie Infinity"));
        list.add(new Game("https://icoholder.com/files/img/01ba51e4fc0c30744bcbf55a39f004de.png","Bomb Crypto"));
        list.add(new Game("https://public.nftstatic.com/static/nft/zipped/36de391da92f40b1a651825f831f4cf1_zipped.png","Metamon Island"));
        list.add(new Game("https://zoogame.finance/img/zoo.png","Zoo Crypto World"));
        list.add(new Game("https://pbs.twimg.com/profile_images/1423286262031470595/c4N4n8k-_400x400.jpg","Thetan arenna"));

        adapter = new GameAdapter(ActivityBSC.this, list);

        lvList.setAdapter(adapter);


        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent Axie = new Intent(ActivityBSC.this, com.example.appgamenft.detailgame.AxieInfinity.class);
                        startActivity(Axie);
                        break;
                    case 1:
                        Intent Bomb = new Intent(ActivityBSC.this, com.example.appgamenft.detailgame.BombCrypto.class);
                        startActivity(Bomb);
                        break;
                    case 2:
                        Intent Metamon = new Intent(ActivityBSC.this, com.example.appgamenft.detailgame.MetamonIsland.class);
                        startActivity(Metamon);
                        break;
                    case 3:
                        Intent Zoo = new Intent(ActivityBSC.this, com.example.appgamenft.detailgame.ZooCryptoWorld.class);
                        startActivity(Zoo);
                        break;
                    case 4:
                        Intent Thetan = new Intent(ActivityBSC.this, DetailGame.class);
                        startActivity(Thetan);
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
                Intent All = new Intent(ActivityBSC.this, ActivityAllGame.class);
                startActivity(All);
                break;
            case R.id.tvBSC:
                Toast.makeText(ActivityBSC.this, "BSC Games", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvEtherium:
                Intent Ehterium = new Intent(ActivityBSC.this, ActivityEtherium.class);
                startActivity(Ehterium);
                break;
            case R.id.tvPolygon:
                Intent Polygon = new Intent(ActivityBSC.this, ActivityPolygon.class);
                startActivity(Polygon);
                break;
            case R.id.Logo:
                Intent main = new Intent(ActivityBSC.this, MainActivity.class);
                startActivity(main);
                break;
        }
    }

}