package com.mkanimes.viperclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Purchase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        Button addChart = findViewById(R.id.addChartBtn);
        addChart.setOnClickListener(v -> Toast.makeText(Purchase.this, "ITEM ADDED TO CART", Toast.LENGTH_LONG).show());

    }
}