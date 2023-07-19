package com.example.hw32_month3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hw32_month3.FoodAdapter;
import com.example.hw32_month3.R;

import java.util.ArrayList;

public class MainActivity<RecyclerVie> extends AppCompatActivity {

    private RecyclerView recycler_view;
    private ArrayList<String> shopList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.rv_shop);
        loadData();
        FoodAdapter adapter = new FoodAdapter(shopList);
        recycler_view.setAdapter(adapter);
    }

    private void loadData() {
        shopList.add("спагетти болоньезе");
        shopList.add("спагетти карбонара");
        shopList.add("фетуччини в сливочном соусе");
        shopList.add("фетуччини в томатном соусе");
        shopList.add("Ризотто с белым вином");
        shopList.add("классная пасто");
        shopList.add("еще классная паста");
    }
}
