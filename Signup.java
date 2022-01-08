package com.tobiloba.mydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import java.util.HashMap;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        EditText username = findViewById(R.id.sign_user);
        EditText pass = findViewById(R.id.sign_pword);
        EditText email = findViewById(R.id.sign_email);
        Button signup = findViewById(R.id.signup);
        final String user = username.getText().toString();
        final String password = pass.getText().toString();
        final String Email = email.getText().toString();
        final String check = "";
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.contentEquals(check) || password.contentEquals(check) || Email.contentEquals(check)){
                    Toast.makeText(Signup.this,"Invalid sign up",Toast.LENGTH_LONG).show();
                }else{
                   // HashMap<String, String> sign = new HashMap<>();
                    //sign.put("username",user);
                    //sign.put("password",password);
                    //sign.put("email",Email);

                    Intent goto_to_home = new Intent(Signup.this,Home_main_list.class);
                    startActivity(goto_to_home);
                    finish();

                }
            }
        });


    }
}