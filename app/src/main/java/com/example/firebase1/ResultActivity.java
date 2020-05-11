package com.example.firebase1;

import
        androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;




public class ResultActivity extends AppCompatActivity {

    private TextView tv_result;
    private ImageView iv_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String nickName = intent.getStringExtra("nickName"); // 전달받음
        String photoUrl = intent.getStringExtra("photoUrl"); // 전달받음

        tv_result = findViewById(R.id.tv_result);
        tv_result.setText(nickName);

        iv_profile = findViewById((R.id.iv_profile));

    }
}
