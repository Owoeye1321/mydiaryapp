package com.tobiloba.mydiary;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Splash screen
        setContentView(R.layout.splash_screen);
        //Splash screen over
        TextView textView = findViewById(R.id.mydiary);
        textView.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent goto_home_main_list = new Intent(MainActivity.this,Log_in_activity.class);
                startActivity(goto_home_main_list);
                finish();

            }
        },5000);

    }
}