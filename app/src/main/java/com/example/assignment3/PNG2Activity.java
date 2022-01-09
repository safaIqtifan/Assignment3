package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.assignment3.Adapter.LetterAdapter;
import com.example.assignment3.model.LetterModel;
import java.util.ArrayList;

public class PNG2Activity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_n_g2);

        list = findViewById(R.id.letterLV);
        ArrayList<LetterModel> data = new ArrayList<>();

        LetterModel f1 = new LetterModel(1,"sssssss");
        LetterModel f2 = new LetterModel(2,"fffffff");
        LetterModel f3 = new LetterModel(3,"khguy");
        LetterModel f4 = new LetterModel(4,"eeeeeeee");
        LetterModel f5 = new LetterModel(5,"jtf");
        LetterModel f6 = new LetterModel(6,"yyyyyyyy");
        LetterModel d = new LetterModel(7,"lyv");
        LetterModel a = new LetterModel(8,"kutdu6r");
        LetterModel aa = new LetterModel(9,"mkklutf");
        LetterModel aaa = new LetterModel(10,"nbvyc");
        LetterModel aaaa = new LetterModel(11,"bbyv");
        LetterModel aaaaa = new LetterModel(12,"zpl[]");

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

        LetterAdapter letterAdapter = new LetterAdapter(this, data);
        list.setAdapter(letterAdapter);

    }
}