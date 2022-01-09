package com.example.assignment3.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.assignment3.R;
import com.example.assignment3.model.Cardmodel;

import java.util.ArrayList;

public class CardAdapter extends BaseAdapter {

    Context context;
    ArrayList<Cardmodel> data;

    public CardAdapter(Context context, ArrayList<Cardmodel> data) {
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
            root = LayoutInflater.from(context).inflate(R.layout.item_card_view, null, false);

        final TextView tvplanet = root.findViewById(R.id.planet);
        final TextView tvdistance = root.findViewById(R.id.distance);
        final TextView tvsurface = root.findViewById(R.id.surface);
        final TextView tvdiameter = root.findViewById(R.id.diameter);

        tvplanet.setText(data.get(position).getPlanet());
        tvdistance.setText(data.get(position).getDistance());
        tvsurface.setText(data.get(position).getSurface());
        tvdiameter.setText(data.get(position).getDiameter());

        return root;
    }
}
