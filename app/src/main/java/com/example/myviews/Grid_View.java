package com.example.myviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class Grid_View extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid__view);

        gridView = findViewById(R.id.gv);

        String[]values = {"One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,values);
        gridView.setAdapter(adapter);
    }
}
