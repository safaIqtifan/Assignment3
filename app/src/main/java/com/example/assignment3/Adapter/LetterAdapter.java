package com.example.assignment3.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment3.R;
import com.example.assignment3.model.GrideFood;
import com.example.assignment3.model.LetterModel;

import java.util.ArrayList;
import java.util.Random;

public class LetterAdapter extends BaseAdapter {

    Context context;
    ArrayList<LetterModel> data;

    public LetterAdapter(Context context, ArrayList<LetterModel> data) {
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
            root = LayoutInflater.from(context).inflate(R.layout.item_list_view_letter, null, false);

        final TextView tvName = root.findViewById(R.id.textView);
        final TextView letter = root.findViewById(R.id.letter);

        tvName.setText(data.get(position).getName());
        String name = tvName.getText().toString();

        char firstLetter = name.charAt(0);
        letter.setText(String.valueOf(firstLetter));

        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
//        letter.setBackgroundColor(color);

        GradientDrawable backgroundGradient = (GradientDrawable)letter.getBackground();
        backgroundGradient.setColor(color);

        return root;

    }
}
