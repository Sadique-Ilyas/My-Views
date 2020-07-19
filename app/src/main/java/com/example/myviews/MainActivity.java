package com.example.myviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] values = {"List View","Grid View", "Web View", "Search View"};

        lv = findViewById(R.id.lv);

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, values);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, List_View.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, Grid_View.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, Web_View.class);
                        startActivity(intent2);
                        Toast.makeText(MainActivity.this,"Turn On Internet, if it isn't and try again",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, Search_View.class);
                        startActivity(intent3);
                        break;
                }
            }
        });
    }
}

