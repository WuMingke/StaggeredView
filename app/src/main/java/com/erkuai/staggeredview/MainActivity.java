package com.erkuai.staggeredview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private StaggeredGridLayoutManager layoutManager;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            strings.add("item" + i);
        }

        recycler = (RecyclerView) findViewById(R.id.recycler);

        layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recycler.setLayoutManager(layoutManager);
        adapter = new MyAdapter(strings);
        recycler.setAdapter(adapter);
    }
}
