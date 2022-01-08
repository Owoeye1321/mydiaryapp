package com.tobiloba.mydiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class Log_in_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_diary);
        TextView log_sign = findViewById(R.id.log_sign);
        Button Log = findViewById(R.id.login);
        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goto_home_main_list = new Intent(Log_in_activity.this,Home_main_list.class);
                startActivity(goto_home_main_list);
                finish();
            }
        });

        log_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goto_sign_up = new Intent(Log_in_activity.this,Signup.class);
                startActivity(goto_sign_up);

            }
        });
        TextView forget_password = findViewById(R.id.forget_pword);
        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent goto_forget_password = new Intent(Log_in_activity.this,forget_password.class);
                  startActivity(goto_forget_password);
            }
        });


    }
}