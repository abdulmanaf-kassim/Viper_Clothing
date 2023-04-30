package com.mkanimes.viperclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Purchase3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase3);


        Button addChart = findViewById(R.id.addChartBtn);
        addChart.setOnClickListener(v -> Toast.makeText(Purchase3.this, "ITEM ADDED TO CART", Toast.LENGTH_LONG).show());

    }
}