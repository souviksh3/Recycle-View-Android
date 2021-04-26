package com.example.demo_recylview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    RecyclerView recyclerview;

    RecyclerView.Adapter adapter;

    ArrayList<Pojo> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recyclerview);

        data.add(new Pojo("5th june 2019", "IND", "RSA", "3 pm"));
        data.add(new Pojo("9th june 2019", "IND", "AUS", "3 pm"));
        data.add(new Pojo("13th june 2019", "IND", "NZ", "3 pm"));
        data.add(new Pojo("16th june 2019", "IND", "PAK", "3 pm"));
        data.add(new Pojo("22th june 2019", "IND", "AFG", "3 pm"));
        data.add(new Pojo("27th june 2019", "IND", "WI", "3 pm"));
        data.add(new Pojo("02th july 2019", "IND", "BAN", "3 pm"));
        data.add(new Pojo("06th july 2019", "IND", "SRI", "3 pm"));


        adapter = new AdapterMatch(this, data);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);


        recyclerview.setLayoutManager(mLayoutManager);

        recyclerview.setAdapter(adapter);
    }
}
