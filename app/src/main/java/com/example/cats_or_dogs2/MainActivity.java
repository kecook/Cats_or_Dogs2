package com.example.cats_or_dogs2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
//don't need the implements CatAdapter.listClickListener put that in TableViewActivity
public class MainActivity extends AppCompatActivity{
    Button cats_btn;
    Button dogs_dtn;
    Button back_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cats_btn = findViewById(R.id.cats);
//       animal_table = findViewById(R.id.recycler_table);
//        animal_table.setLayoutManager(new LinearLayoutManager(this));
//        catList = new ArrayList(0);
//
//        CatAdapter adapter = new CatAdapter(this,catList);
//        adapter.listener = this;
//        animal_table.setAdapter(adapter);

        configureCatButton();

    }

    private void configureCatButton(){
        cats_btn = findViewById(R.id.cats);
        cats_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TableViewActivity.class));
            }
        });
    }


}