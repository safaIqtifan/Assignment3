package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.assignment3.Adapter.CardAdapter;
import com.example.assignment3.Adapter.LetterAdapter;
import com.example.assignment3.model.Cardmodel;
import com.example.assignment3.model.LetterModel;

import java.util.ArrayList;

public class PNG1Activity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_n_g1);

        list = findViewById(R.id.cardLV);
        ArrayList<Cardmodel> data = new ArrayList<>();

        Cardmodel f1 = new Cardmodel(1,"Earth", "150 Million KM", "10 N/kg", "12750 KM");
        Cardmodel f2 = new Cardmodel(2,"Jupiter", "778 Million KM", "26 N/kg", "143000 KM");
        Cardmodel f3 = new Cardmodel(3,"Mars", "228 Million KM", "4 N/kg", "6800 KM");
        Cardmodel f4 = new Cardmodel(4,"Pluto", "5900 Million KM", "1 N/kg", "2320 KM");
        Cardmodel f5 = new Cardmodel(5,"Earth", "150 Million KM", "10 N/kg", "12750 KM");
        Cardmodel f6 = new Cardmodel(6,"Jupiter", "778 Million KM", "26 N/kg", "143000 KM");
        Cardmodel d = new Cardmodel(7,"Mars", "228 Million KM", "4 N/kg", "6800 KM");
        Cardmodel a = new Cardmodel(8,"Pluto", "5900 Million KM", "1 N/kg", "2320 KM");
        Cardmodel aa = new Cardmodel(9,"Earth", "150 Million KM", "10 N/kg", "12750 KM");
        Cardmodel aaa = new Cardmodel(10,"Jupiter", "778 Million KM", "26 N/kg", "143000 KM");
        Cardmodel aaaa = new Cardmodel(11,"Mars", "228 Million KM", "4 N/kg", "6800 KM");
        Cardmodel aaaaa = new Cardmodel(12,"Pluto", "5900 Million KM", "1 N/kg", "2320 KM");

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

        CardAdapter cardAdapter = new CardAdapter(this, data);
        list.setAdapter(cardAdapter);

    }
}