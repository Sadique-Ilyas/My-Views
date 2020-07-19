package com.example.myviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class Search_View extends AppCompatActivity implements SearchView.OnQueryTextListener {
    SearchView searchView;
    ListView listView;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__view);

        searchView = findViewById(R.id.sv);
        listView = findViewById(R.id.lv);

        String[]values = {"One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,values);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(this);
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.getFilter().filter(newText);
        return false;
    }
}
