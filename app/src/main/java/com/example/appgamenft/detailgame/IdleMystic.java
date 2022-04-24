package com.example.appgamenft.detailgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.appgamenft.R;

public class IdleMystic extends AppCompatActivity implements View.OnClickListener {
    private Button btnGet;
    private ImageView imgGameIcon, imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idle_mystic);

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
                Toast.makeText(IdleMystic.this, "installing", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imgBack:
                onBackPressed();
                break;
        }
    }
}