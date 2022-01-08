package com.tobiloba.mydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Detailed_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_);
        //to get the intent details
        String savedExtra = getIntent().getStringExtra("Content");
        final TextView text = findViewById(R.id.detail);
        text.setText(savedExtra);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.editable_phase);
                EditText editText = findViewById(R.id.detail);
                String before = text.getText().toString();
                editText.setText(before);
            }
        });

    }
}