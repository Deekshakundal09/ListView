package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListDetails extends AppCompatActivity {

    TextView name;
    TextView login;
    TextView fullname;
    TextView owner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_details);

        name=findViewById(R.id.name);
        login=findViewById(R.id.login);
        fullname=findViewById(R.id.fullname);
        owner=findViewById(R.id.owner);



        Intent intent=getIntent();
        final String carName = intent.getStringExtra("carName");
        final String carLogin = intent.getStringExtra("carLogin");
        final String carFullName = intent.getStringExtra("carFullName");
        final String carOwner = intent.getStringExtra("carOwner");
        Log.d("name", "onCreate: "+carName);
        Log.d("carLogin", "onCreate: "+carLogin);
        Log.d("carFullName", "onCreate: "+carFullName);

        name.setText(carName);
        login.setText(carLogin);
        fullname.setText(carFullName);
        // owner.setText(carOwner);


    }
}
