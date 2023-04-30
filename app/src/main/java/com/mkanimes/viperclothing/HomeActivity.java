package com.mkanimes.viperclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button bMen=findViewById(R.id.menBtn);
        Button bWomen = findViewById(R.id.womenBtn);
        Button bKids = findViewById(R.id.kidsBtn);
        ImageButton mHome = findViewById(R.id.home);

        bMen.setOnClickListener(v -> {
            Intent intent= new Intent(HomeActivity.this,MenOutfits.class);
            startActivity(intent);
        });


        bWomen.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,WomenOutfits.class);
            startActivity(intent);
        });

        bKids.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,KidsOutfits.class);
            startActivity(intent);
        });

        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}