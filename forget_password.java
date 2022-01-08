package com.tobiloba.mydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import java.util.HashMap;

public class forget_password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password);
        Button forget_password = findViewById(R.id.send_pword);
        EditText email = findViewById(R.id.forget_email);
        final String Email = email.getText().toString();
        final String check = "";

        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Email.contentEquals(check)){
                    Toast.makeText(forget_password.this,"Invalid email",Toast.LENGTH_LONG).show();
                }else{
                  ////  HashMap<String, String> forget = new HashMap<>();
                 //   forget.put("Email",Email);
                    Intent goto_login = new Intent(forget_password.this,MainActivity.class);
                    startActivity(goto_login);
                }
            }
        });
    }
}