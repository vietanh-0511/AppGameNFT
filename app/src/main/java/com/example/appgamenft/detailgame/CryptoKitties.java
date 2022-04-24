package com.example.appgamenft.detailgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.appgamenft.R;

public class CryptoKitties extends AppCompatActivity implements View.OnClickListener {

    private Button btnGet;
    private ImageView imgGameIcon, imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_kitties);

        imgGameIcon = findViewById(R.id.imgGameIcon);
        btnGet = findViewById(R.id.btnGet);
        imgBack = findViewById(R.id.imgBack);

        btnGet.setOnClickListener(this);
        imgBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGet:
                try {
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.dragons.tokens.crypto&hl=en&gl=US"));
                    startActivity(myIntent);
                }
                catch (ActivityNotFoundException e) {
                Toast.makeText(this, "No application can handle this request."
                        + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }
                break;
            case R.id.imgBack:
                onBackPressed();
                break;
        }
    }
}