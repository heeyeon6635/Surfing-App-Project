package com.example.day0528_2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000; // 스플래시 화면 표시 시간 (3초)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // 메인 액티비티로 이동
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                // 스플래시 액티비티 종료
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
