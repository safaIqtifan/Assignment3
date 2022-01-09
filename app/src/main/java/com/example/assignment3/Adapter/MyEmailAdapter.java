package com.example.assignment3.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.assignment3.R;
import com.example.assignment3.model.LetterModel;
import com.example.assignment3.model.MyEmailModel;

import java.util.ArrayList;
import java.util.Random;

public class MyEmailAdapter extends BaseAdapter {

    Context context;
    ArrayList<MyEmailModel> data;

    public MyEmailAdapter(Context context, ArrayList<MyEmailModel> data) {
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
            root = LayoutInflater.from(context).inflate(R.layout.item_mail, null, false);

        final TextView letterEmail = root.findViewById(R.id.letterEmail);
        final TextView nameEmail = root.findViewById(R.id.nameEmail);

        nameEmail.setText(data.get(position).getName());
        String name = nameEmail.getText().toString();

        char firstLetter = name.charAt(0);
        letterEmail.setText(String.valueOf(firstLetter));

        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
//        letterEmail.setBackgroundColor(color);

//        Drawable background = letterEmail.getBackground();
        GradientDrawable backgroundGradient = (GradientDrawable)letterEmail.getBackground();
        backgroundGradient.setColor(color);

        return root;

    }
}
