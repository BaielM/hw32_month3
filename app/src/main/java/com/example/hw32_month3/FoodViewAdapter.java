package com.example.hw32_month3;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class FoodViewAdapter extends RecyclerView.ViewHolder {
    private TextView tv_ariston;

    public FoodViewAdapter(View inflate) {
        super(inflate);
        tv_ariston = inflate.findViewById(R.id.tv_foodList);
    }
    public void bind(String product){
        tv_ariston.setText(product);
    }
}
