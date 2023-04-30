package com.mkanimes.viperclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class PurchaseW2nd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_w2nd);

        Button addChart = findViewById(R.id.addChartBtn);
        addChart.setOnClickListener(v -> Toast.makeText(PurchaseW2nd.this, "ITEM ADDED TO CART", Toast.LENGTH_LONG).show());

    }
}