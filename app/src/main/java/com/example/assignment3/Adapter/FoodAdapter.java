package com.example.assignment3.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment3.R;
import com.example.assignment3.model.GrideFood;

import java.util.ArrayList;

public class FoodAdapter extends BaseAdapter {

    Context context;
    ArrayList<GrideFood> data;

    public FoodAdapter(Context context, ArrayList<GrideFood> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View root = convertView;
        if (root == null)
            root = LayoutInflater.from(context).inflate(R.layout.item_food_view, null, false);

        final TextView tvName = root.findViewById(R.id.tv);
        final ImageView imageView = root.findViewById(R.id.img);

        tvName.setText(data.get(position).getFoodName());
        imageView.setImageResource(data.get(position).getImg());

        return root;
    }
}
