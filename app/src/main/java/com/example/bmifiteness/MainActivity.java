package com.example.bmifiteness;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        LinearLayout linear= findViewById(R.id.linear);
        EditText height_ft,height_in,weight;
        TextView text = findViewById(R.id.Result);
        btn = findViewById(R.id.btn);
        height_ft = findViewById(R.id.height_ft);
        height_in= findViewById(R.id.height_in);
        weight = findViewById(R.id.Weight);
        int ft =  Integer.parseInt(Objects.requireNonNull(height_ft.getText()).toString());
        int in = Integer.parseInt(Objects.requireNonNull(height_in.getText()).toString());
        int wt =  Integer.parseInt(Objects.requireNonNull(weight.getText()).toString());
       try {
           btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "hi", Toast.LENGTH_SHORT).show();
           }
       });

       }catch (Exception e){
           Toast.makeText(MainActivity.this, "hi"+e, Toast.LENGTH_SHORT).show();
       }

    }
}