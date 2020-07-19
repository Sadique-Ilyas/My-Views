package com.example.myviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List_View extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__view);

        listView = findViewById(R.id.lv);

        String[]values = {"One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,values);
        listView.setAdapter(adapter);
    }
}
