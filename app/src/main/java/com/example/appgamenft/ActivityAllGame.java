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

import com.example.appgamenft.detailgame.BombCrypto;

import java.util.ArrayList;
import java.util.List;

public class ActivityAllGame extends AppCompatActivity implements View.OnClickListener {

    private ListView lvList;
    private GameAdapter adapter;
    private TextView tvAll, tvBSC, tvEtherium, tvPolygon;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_game);

        lvList = findViewById(R.id.lvListGame);

        List<Game> list = new ArrayList<>();
        list.add(new Game("https://gfsblockchain.com/wp-content/uploads/2021/09/tong-quan-ghst.jpg","Aavegotchi"));
        list.add(new Game("https://pbs.twimg.com/profile_images/1454114449196003334/ptrtm5Yj_400x400.jpg","Axie Infinity"));
        list.add(new Game("https://icoholder.com/files/img/01ba51e4fc0c30744bcbf55a39f004de.png","Bomb Crypto"));
        list.add(new Game("https://dappimg.com/media/image/app/77331e708081482c9994921a1a0eddf9.jpg","Crypto Kitties"));
        list.add(new Game("https://yt3.ggpht.com/5IdayuWj4r0oF_d3RGfKFegQ3YpYBYGmnfYzrKtGbJOmgnwmoiOj86qJJZu4QuBKevM0NKT0bQ=s900-c-k-c0x00ffffff-no-rj","Idle Mystic"));
        list.add(new Game("https://play-lh.googleusercontent.com/FFrLl6CiLmeRjXLpNYnKuBXZ_fuGrUniMZrdP9cCkUh2Zze3DePEVVT30UdmFnDDY6s=w512","League of Kingdoms"));
        list.add(new Game("https://public.nftstatic.com/static/nft/zipped/36de391da92f40b1a651825f831f4cf1_zipped.png","Metamon Island"));
        list.add(new Game("https://assets.coingecko.com/coins/images/19305/large/Logo_200x200_%281%29.png?1634972378","Pegaxy"));
        list.add(new Game("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAV1BMVEUAru////8Aq+6N1fcAqO45uPEwtPDh9/58z/Zty/Vmx/QAqu7t+f7o9/77//9yyvX0/P9VwvOL0PWGzvWh2Peq3PgApe2Y1vbj+P5FvPJJv/La8/3M8PzdGMU+AAACfElEQVR4nO3c0W6CQBBGYURakbWIba1t7fs/ZymJrYlCjGHmn8I5V14Zv+Cyxt0ly4iIiIiIiIiIiIiIiIiIiIiIiGh25Y/jl6tR56Vqsxi5ZlElNeuvVI7t6yrDEFNZmwjrKMS0tQG2xG0IYqqMfD9FGItpawhcLPRX0WoMnpKPRWugnJhbjsFTlXDqN73JnBFlV9Foor9M9UW1H4OnRGPRbqK/QlRMGi43mb8Et5t86SpcIkSIECFChAgRIkSIcLimWvdVNZMQrt7yvt5W0xAWvW9SIERoGUKEXQgRmoYQYdcMhO9TF2YfWe+v8vPShx/st3GEkUOIMH4IEcYPIcL4IZyVsP8/7+H+jfDe1Dug7YWNmOiwutYo9876rB/WOyXRZYVUSvRZA66FY9FplVt4u/Fax9fdbtx2KtSfIqLfXgzVWHTcbSIai577aTRj0XXHkGRe9D2NICG6nQnqEqzMtMTnqQtdiRphll6mLrQ+BBxA6HcVZUK3sagTehGFQqd5USn0IUqFLl9UrdCDKBY6TBpqYZY+y3vaHv+N8LatTReFPo0wSqF37o0SQoTxQ4gwfggRxi+2MM/T71b64Rf97xFamC+Pm7ants3wi6/+tbHgwls/3Pusz8wgRGgZQoRdCBGahnBWwsk/n+a4q/raRf5X/3bh0KNqb36MbWjhKCFEiBAhQoQIESJEeF3otj24a61YmXl1BB4ki2vF3g24Fx3pdyMuZc8sKA4evvogPLWePIhKoMsXVQt0IKqBLdF00pCOwVOWYzEEsCXaXcUYQMOxGAVoRowDNJr614GA7c/wh/FTm4iIiIiIiIiIiIiIiIiIiIiIiEjQNw40Sgr1Ggs7AAAAAElFTkSuQmCC","The Sandbox"));
        list.add(new Game("https://pbs.twimg.com/profile_images/1425007286401912835/Lf5aQcxz_400x400.jpg","Tiny Hero"));
        list.add(new Game("https://zoogame.finance/img/zoo.png","Zoo Crypto World"));
        list.add(new Game("https://pbs.twimg.com/profile_images/1423286262031470595/c4N4n8k-_400x400.jpg","Thetan arenna"));

        adapter = new GameAdapter(ActivityAllGame.this, list);

        lvList.setAdapter(adapter);

        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent Aavegotchi = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.Aavegotchi.class);
                        startActivity(Aavegotchi);
                        break;
                    case 1:
                        Intent Axie = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.AxieInfinity.class);
                        startActivity(Axie);
                        break;
                    case 2:
                        Intent Bomb = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.BombCrypto.class);
                        startActivity(Bomb);
                        break;
                    case 3:
                        Intent Crypto = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.CryptoKitties.class);
                        startActivity(Crypto);
                        break;
                    case 4:
                        Intent Idle = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.IdleMystic.class);
                        startActivity(Idle);
                        break;
                    case 5:
                        Intent League = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.LeagueOfKingdom.class);
                        startActivity(League);
                        break;
                    case 6:
                        Intent Metamon = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.MetamonIsland.class);
                        startActivity(Metamon);
                        break;
                    case 7:
                        Intent Pegaxy = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.Pegaxy.class);
                        startActivity(Pegaxy);
                        break;
                    case 8:
                        Intent Sandbox = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.TheSanbox.class);
                        startActivity(Sandbox);
                        break;
                    case 9:
                        Intent Tiny = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.TinyHero.class);
                        startActivity(Tiny);
                        break;
                    case 10:
                        Intent Zoo = new Intent(ActivityAllGame.this , com.example.appgamenft.detailgame.ZooCryptoWorld.class);
                        startActivity(Zoo);
                        break;
                    case 11:
                        Intent Thetan = new Intent(ActivityAllGame.this , DetailGame.class);
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
                Toast.makeText(ActivityAllGame.this, "All Games", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvBSC:
                Intent BSC = new Intent(ActivityAllGame.this, ActivityBSC.class);
                startActivity(BSC);
                break;
            case R.id.tvEtherium:
                Intent Ehterium = new Intent(ActivityAllGame.this, ActivityEtherium.class);
                startActivity(Ehterium);
                break;
            case R.id.tvPolygon:
                Intent Polygon = new Intent(ActivityAllGame.this, ActivityPolygon.class);
                startActivity(Polygon);
                break;
            case R.id.Logo:
                Intent main = new Intent(ActivityAllGame.this, MainActivity.class);
                startActivity(main);
                break;
        }
    }
}
