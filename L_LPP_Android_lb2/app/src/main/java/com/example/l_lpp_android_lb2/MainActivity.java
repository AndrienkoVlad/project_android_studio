package com.example.l_lpp_android_lb2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<Item> items = new ArrayList<>();
        items.add(new Item("John", "john@email.com" ));
        items.add(new Item("Enny", "enny@email.com" ));
        items.add(new Item("Carl", "carl@email.com" ));
        items.add(new Item("Qwrqwr", "jqwrqwr@email.com" ));
        items.add(new Item("Joeqwe", "joeqwe@email.com" ));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}