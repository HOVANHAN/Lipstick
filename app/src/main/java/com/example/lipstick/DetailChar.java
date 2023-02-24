package com.example.lipstick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailChar extends AppCompatActivity {
    TextView textView_detail,name,price;
    ImageView imgView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_char);

        Intent intent = getIntent();
        name=findViewById(R.id.name);
        price =findViewById(R.id.price);
        textView_detail =findViewById(R.id.txtdetail);
        imgView=findViewById(R.id.img);
        name.setText(intent.getStringExtra("name").toString());
        price.setText(intent.getStringExtra("price").toString());
//        int resource = Integer.parseInt(intent.getStringExtra("id"));
//        System.out.println(resource);
        imgView.setImageResource(Integer.parseInt(intent.getStringExtra("id")));
        textView_detail.setText(intent.getStringExtra("detail").toString());
    }
}