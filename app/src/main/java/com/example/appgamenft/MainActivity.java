package com.example.appgamenft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appgamenft.detailgame.BombCrypto;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private GameAdapter gameAdapter;
    private TextView tvAll, tvBSC, tvEtherium, tvPolygon;
    private CardView cvBanner;
    private Button btnGet;
    private ListView lvListGame;
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvListGame = findViewById(R.id.lvListGame);
        cvBanner = findViewById(R.id.cvBanner);
        btnGet = findViewById(R.id.btnGet);


        List<Game> list = new ArrayList<>();
        list.add(new Game("https://dappimg.com/media/image/app/77331e708081482c9994921a1a0eddf9.jpg","Crypto Kitties"));
        list.add(new Game("https://yt3.ggpht.com/5IdayuWj4r0oF_d3RGfKFegQ3YpYBYGmnfYzrKtGbJOmgnwmoiOj86qJJZu4QuBKevM0NKT0bQ=s900-c-k-c0x00ffffff-no-rj","Idle Mystic"));
        list.add(new Game("https://play-lh.googleusercontent.com/FFrLl6CiLmeRjXLpNYnKuBXZ_fuGrUniMZrdP9cCkUh2Zze3DePEVVT30UdmFnDDY6s=w512","League of Kingdoms"));

        gameAdapter =new GameAdapter(this, list);
        lvListGame.setAdapter(gameAdapter);

        lvListGame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent Crypto = new Intent(MainActivity.this , com.example.appgamenft.detailgame.CryptoKitties.class);
                        startActivity(Crypto);
                        break;
                    case 1:
                        Intent Idle = new Intent(MainActivity.this , com.example.appgamenft.detailgame.IdleMystic.class);
                        startActivity(Idle);
                        break;
                    case 2:
                        Intent League = new Intent(MainActivity.this , com.example.appgamenft.detailgame.LeagueOfKingdom.class);
                        startActivity(League);
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
        cvBanner.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvAll:
                Intent All = new Intent(MainActivity.this , ActivityAllGame.class);
                startActivity(All);
                break;
            case R.id.tvBSC:
                Intent BSC = new Intent(MainActivity.this , ActivityBSC.class);
                startActivity(BSC);
                break;
            case R.id.tvEtherium:
                Intent Ehterium = new Intent(MainActivity.this , ActivityEtherium.class);
                startActivity(Ehterium);
                break;
            case R.id.tvPolygon:
                Intent Polygon = new Intent(MainActivity.this , ActivityPolygon.class);
                startActivity(Polygon);
                break;
            case R.id.cvBanner:
                Intent Banner = new Intent(MainActivity.this , DetailGame.class);
                startActivity(Banner);
                break;
        }
    }
}