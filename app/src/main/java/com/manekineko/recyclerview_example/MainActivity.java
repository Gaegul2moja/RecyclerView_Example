package com.manekineko.recyclerview_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("RECYCLER_VIEW_EXAMPLE");

        recyclerView = findViewById(R.id.recycler_view_1);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Info> infoArrayList = new ArrayList<>();
        for(int i=1;i<=6;i++){
            infoArrayList.add(new Info(Info.TYPE1, 1,"2018.11.0"+i, "TITLE"+i,"DETAIL"+i));
        }
        MyAdapter myAdapter = new MyAdapter(new MyAdapter.OnClickListener() {
            @Override
            public void click(Info info) {

            }

            @Override
            public void insert() {

            }

            @Override
            public void delete() {

            }
        });
        recyclerView.setAdapter(myAdapter);
        myAdapter.update(infoArrayList);
    }
}
