package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.assignment3.Adapter.FoodAdapter;
import com.example.assignment3.model.GrideFood;

import java.util.ArrayList;

public class PNG4Activity extends AppCompatActivity {

    GridView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_n_g4);

        list = findViewById(R.id.listView);
        ArrayList<GrideFood> data = new ArrayList<>();
        GrideFood f1 = new GrideFood(1, R.drawable.coffee,"Coffee");
        GrideFood f2 = new GrideFood(2, R.drawable.espresso,"Espresso");
        GrideFood f3 = new GrideFood(3, R.drawable.frenchfries,"French Fries");
        GrideFood f4 = new GrideFood(4, R.drawable.honey,"Honey");
        GrideFood f5 = new GrideFood(5, R.drawable.icecream,"Ice Cream");
        GrideFood f6 = new GrideFood(6, R.drawable.ice,"Ice");
        GrideFood d = new GrideFood(1, R.drawable.coffee,"Coffee");
        GrideFood a = new GrideFood(2, R.drawable.espresso,"Espresso");
        GrideFood aa = new GrideFood(3, R.drawable.frenchfries,"French Fries");
        GrideFood aaa = new GrideFood(4, R.drawable.honey,"Honey");
        GrideFood aaaa = new GrideFood(5, R.drawable.icecream,"Ice Cream");
        GrideFood aaaaa = new GrideFood(6, R.drawable.ice,"Ice");

        data.add(f1);
        data.add(f2);
        data.add(f3);
        data.add(f4);
        data.add(f5);
        data.add(f6);
        data.add(d);
        data.add(a);
        data.add(aa);
        data.add(aaa);
        data.add(aaaa);
        data.add(aaaaa);

        FoodAdapter foodAdapter = new FoodAdapter(this, data);
        list.setAdapter(foodAdapter);

    }
}