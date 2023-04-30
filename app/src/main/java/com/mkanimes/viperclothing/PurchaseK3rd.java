package com.mkanimes.viperclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class PurchaseK3rd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_k3rd);


        Button addChart = findViewById(R.id.addChartBtn);
        addChart.setOnClickListener(v -> Toast.makeText(PurchaseK3rd.this, "ITEM ADDED TO CART", Toast.LENGTH_LONG).show());


    }
}