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
        name.add(new Name("Alex"));
        name.add(new Name("Bob"));
        name.add(new Name("Valera"));
        name.add(new Name("Gena"));
        name.add(new Name("Denis"));
        name.add(new Name("Alexander"));
        name.add(new Name("Vitalik"));
        name.add(new Name("Norber"));
        name.add(new Name("Maks"));
        name.add(new Name("Petro"));
        name.add(new Name("Alexis"));
        name.add(new Name("Ali"));
        name.add(new Name("Den"));
        name.add(new Name("Ania"));
        name.add(new Name("Galina"));
        name.add(new Name("Maks"));
        name.add(new Name("Petro"));
        name.add(new Name("Alexis"));
        name.add(new Name("Ali"));
        name.add(new Name("Den"));
        name.add(new Name("Ania"));
        name.add(new Name("Galina"));
        name.add(new Name("Alex"));
        name.add(new Name("Bob"));
        name.add(new Name("Valera"));
        name.add(new Name("Gena"));
        name.add(new Name("Denis"));
        name.add(new Name("Alexander"));
        name.add(new Name("Vitalik"));
        name.add(new Name("Norber"));
        name.add(new Name("Maks"));
        name.add(new Name("Petro"));

        NameAdapter nameAdapter = new NameAdapter(name);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(nameAdapter);
    }
}