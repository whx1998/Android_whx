package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {
    private GridView gridView;
    private AdapterMyGridView adapterMyGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = findViewById(R.id.gridView);

        adapterMyGridView = new AdapterMyGridView(this);
        gridView.setAdapter(adapterMyGridView);
    }
}
