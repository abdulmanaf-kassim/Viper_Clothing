package com.mkanimes.viperclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class KidsOutfits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_outfits);




        ImageView firstImg = findViewById(R.id.imgView);
        ImageView secondImg = findViewById(R.id.imgView2);
        ImageView thirdImg = findViewById(R.id.imgView3);
        ImageView fourthImg = findViewById(R.id.imgView4);
        ImageButton mHome = findViewById(R.id.home);

        firstImg.setOnClickListener(v -> {
            Intent intent = new Intent(KidsOutfits.this,PurchaseK1st.class);
            startActivity(intent);
        });


        secondImg.setOnClickListener(v -> {
            Intent intent = new Intent(KidsOutfits.this,PurchaseK2nd.class);
            startActivity(intent);
        });


        thirdImg.setOnClickListener(v -> {
            Intent intent = new Intent(KidsOutfits.this,PurchaseK3rd.class);
            startActivity(intent);
        });

        fourthImg.setOnClickListener(v -> {
            Intent intent = new Intent(KidsOutfits.this,PurchaseK4th.class);
            startActivity(intent);
        });

        mHome.setOnClickListener(v -> {
            Intent intent = new Intent(KidsOutfits.this,HomeActivity.class);
            startActivity(intent);
        });


    }
}