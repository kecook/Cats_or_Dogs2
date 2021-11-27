package com.example.cats_or_dogs2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class TableViewActivity extends AppCompatActivity implements CatAdapter.listClickListener {
    RecyclerView animal_table;
    ArrayList catList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_view);

        configureBackButton();
animal_table = findViewById(R.id.recycler_table);
animal_table.setLayoutManager(new LinearLayoutManager(this));
catList = new CatManager().listOfCats;

CatAdapter adapter = new CatAdapter(this,catList);
adapter.listener = this;
animal_table.setAdapter(adapter);

    }

 private void configureBackButton(){
        Button back_btn = (Button) findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });

    }

    @Override
    public void onCatSelected(CatModel selectedCats) {
        Toast.makeText(this,"you picked a cat", Toast.LENGTH_LONG).show();
    }
}