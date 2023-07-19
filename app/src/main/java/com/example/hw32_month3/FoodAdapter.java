package com.example.hw32_month3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewAdapter>{

    private ArrayList<String> foodList;

    public FoodAdapter(ArrayList<String> shopList) {
        this.foodList = shopList;
    }

    @NonNull
    @Override
    public FoodViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FoodViewAdapter(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
