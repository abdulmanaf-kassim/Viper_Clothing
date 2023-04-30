package com.mkanimes.viperclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MenOutfits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_outfits);

        ImageView firstImg = findViewById(R.id.imgView);
        ImageView secondImg = findViewById(R.id.imgView2);
        ImageView thirdImg = findViewById(R.id.imgView3);
        ImageView fourthImg = findViewById(R.id.imgView4);
        ImageButton mHome = findViewById(R.id.home);


        firstImg.setOnClickListener(v -> {
            Intent intent = new Intent(MenOutfits.this,Purchase.class);
            startActivity(intent);
        });


        secondImg.setOnClickListener(v -> {
            Intent intent = new Intent(MenOutfits.this,Purchase2.class);
            startActivity(intent);
        });

        thirdImg.setOnClickListener(v -> {
            Intent intent = new Intent(MenOutfits.this,Purchase3.class);
            startActivity(intent);
        });
        fourthImg.setOnClickListener(v -> {
            Intent intent = new Intent(MenOutfits.this,Purchase4.class);
            startActivity(intent);
        });


        mHome.setOnClickListener(v -> {
            Intent intent = new Intent(MenOutfits.this,HomeActivity.class);
            startActivity(intent);
        });


    }
}