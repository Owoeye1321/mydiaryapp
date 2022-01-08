package com.tobiloba.mydiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class Home_main_list extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main_list);

        final String[] contentArray={"Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database",
                "Incoming from the database"
        };
        final String[] dateArray ={"25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020",
                "25_06_2020"
        };

        final String[] detailArray={
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database",
                "Incoming from the database\n" +
                        " Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database\n" +
                        "Incoming from the database"
        };

        ListView view  = findViewById(R.id.my_list);
        ListAdapter custom  = new ListAdapter(this,contentArray,dateArray);
        view.setAdapter(custom);

        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Home_main_list.this,Detailed_Activity.class);
                String message = detailArray[position];
                intent.putExtra("Content",message);
                startActivity(intent);

            }
        });
        ImageView write = findViewById(R.id.img);
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent goto_editable_phase = new Intent(Home_main_list.this,EditableLayout.class);
               startActivity(goto_editable_phase);
            }
        });



    }
}