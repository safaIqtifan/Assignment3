package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.assignment3.Adapter.LetterAdapter;
import com.example.assignment3.Adapter.MyEmailAdapter;
import com.example.assignment3.model.LetterModel;
import com.example.assignment3.model.MyEmailModel;

import java.util.ArrayList;

public class PNG3Activity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_n_g3);

        list = findViewById(R.id.emailLV);
        ArrayList<MyEmailModel> data = new ArrayList<>();

        MyEmailModel f1 = new MyEmailModel(1,"sssssss");
        MyEmailModel f2 = new MyEmailModel(2,"fffffff");
        MyEmailModel f3 = new MyEmailModel(3,"khguy");
        MyEmailModel f4 = new MyEmailModel(4,"eeeeeeee");
        MyEmailModel f5 = new MyEmailModel(5,"jtf");
        MyEmailModel f6 = new MyEmailModel(6,"yyyyyyyy");
        MyEmailModel d = new MyEmailModel(7,"lyv");
        MyEmailModel a = new MyEmailModel(8,"kutdu6r");
        MyEmailModel aa = new MyEmailModel(9,"mkklutf");
        MyEmailModel aaa = new MyEmailModel(10,"nbvyc");
        MyEmailModel aaaa = new MyEmailModel(11,"bbyv");
        MyEmailModel aaaaa = new MyEmailModel(12,"zpl[]");

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

        MyEmailAdapter myEmailAdapter = new MyEmailAdapter(this, data);
        list.setAdapter(myEmailAdapter);
        Log.e("a","sssss");

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(getApplicationContext(), EmailDetails.class);
                i.putExtra("email", data.get(position));
                startActivity(i);

            }
        });

    }
}