package com.mkanimes.viperclothing;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.txtName);
        password = findViewById(R.id.txtPass);
        Button login = findViewById(R.id.loginBtn);


        login.setOnClickListener(v -> {
            String inputName = username.getText().toString();
            String inputPass = password.getText().toString();
            if(inputName.isEmpty() || inputPass.isEmpty()){
                Toast.makeText(MainActivity.this, "Please enter all the credentials correctly !", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
    });

    }}