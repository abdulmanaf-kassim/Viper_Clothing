package com.mkanimes.viperclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class WomenOutfits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_outfits);

        ImageView firstImg = findViewById(R.id.imgView);
        ImageView secondImg = findViewById(R.id.imgView2);
        ImageView thirdImg = findViewById(R.id.imgView3);
        ImageView fourthImg = findViewById(R.id.imgView4);
        ImageButton mHome = findViewById(R.id.home);

        firstImg.setOnClickListener(v -> {
            Intent intent = new Intent(WomenOutfits.this,PurchaseW1st.class);
            startActivity(intent);
        });


        secondImg.setOnClickListener(v -> {
            Intent intent = new Intent(WomenOutfits.this,PurchaseW2nd.class);
            startActivity(intent);
        });


        thirdImg.setOnClickListener(v -> {
            Intent intent = new Intent(WomenOutfits.this,PurchaseW3rd.class);
            startActivity(intent);
        });

        fourthImg.setOnClickListener(v -> {
            Intent intent = new Intent(WomenOutfits.this,PurchaseW4th.class);
            startActivity(intent);
        });


        mHome.setOnClickListener(v -> {
            Intent intent = new Intent(WomenOutfits.this,HomeActivity.class);
            startActivity(intent);
        });







    }
}