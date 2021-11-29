package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Name> name =new ArrayList<>();
        name.add(new Name("Alex",R.drawable.one));
        name.add(new Name("Gleb",R.drawable.two));
        name.add(new Name("Max",R.drawable.there));
        name.add(new Name("Boris",R.drawable.two));
        name.add(new Name("Nina",R.drawable.one));
        name.add(new Name("Lema",R.drawable.ic_baseline_auto_delete_24));
        name.add(new Name("Lara",R.drawable.ic_baseline_auto_delete_24));
        name.add(new Name("Alexika",R.drawable.four));
        name.add(new Name("Vova",R.drawable.ic_baseline_auto_delete_24));
        name.add(new Name("Den",R.drawable.ic_baseline_auto_delete_24));
        name.add(new Name("Alexis",R.drawable.four));
        name.add(new Name("Bob",R.drawable.there));
        name.add(new Name("Alex",R.drawable.one));
        name.add(new Name("Gleb",R.drawable.two));
        name.add(new Name("Max",R.drawable.there));
        name.add(new Name("Boris",R.drawable.two));
        name.add(new Name("Nina",R.drawable.one));
        name.add(new Name("Lema",R.drawable.ic_baseline_auto_delete_24));
        name.add(new Name("Lara",R.drawable.ic_baseline_auto_delete_24));
        name.add(new Name("Alexika",R.drawable.four));
        name.add(new Name("Vova",R.drawable.ic_baseline_auto_delete_24));
        name.add(new Name("Den",R.drawable.ic_baseline_auto_delete_24));
        name.add(new Name("Alexis",R.drawable.four));
        name.add(new Name("Bob",R.drawable.there));


        NameAdapter nameAdapter = new NameAdapter(name);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(nameAdapter);
    }
}