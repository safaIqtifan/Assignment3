package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.assignment3.model.MyEmailModel;

public class EmailDetails extends AppCompatActivity {

    TextView letterEmail, nameEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_details);

        letterEmail = findViewById(R.id.letterEmail);
        nameEmail = findViewById(R.id.nameEmail);

        Bundle bundle = getIntent().getExtras();
        MyEmailModel myEmailModel = bundle.getParcelable("email");

        nameEmail.setText(myEmailModel.getName());
        letterEmail.setText(String.valueOf(nameEmail.getText().toString().charAt(0)));

    }
}