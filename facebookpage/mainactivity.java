package com.example.facebookpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint("MissingInflatedId")

        ImageView facebookView = findViewById(R.id.fbview);
        ImageView likeImgView = findViewById(R.id.likeview);
        ImageView commentImgView = findViewById(R.id.commentview);
        ImageView shareImgView = findViewById(R.id.shareview);

        likeImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the Like button");
            }
        });
        commentImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the Comment button");
            }
        });
        shareImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the Share button");
            }
        });
    }private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
