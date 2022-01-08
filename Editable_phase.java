package com.tobiloba.mydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.util.HashMap;

public class Editable_phase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editable_phase);
        EditText editText = findViewById(R.id.detail);
        String save = editText.getText().toString();
        HashMap<String, String> saver = new HashMap<>();
        saver.put("diary",save);
    }
}