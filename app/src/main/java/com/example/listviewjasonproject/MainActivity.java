package com.example.listviewjasonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.listviewjasonproject.R.id.List;

public class MainActivity extends AppCompatActivity {
    ListView view;

    String[] RepoName ={"grit","merb-core", "rubinius","god", "jsawesome","jspec", "exception_logger","ambition", "restful-authentication","attachment_fu", "microsis","s3","taboo","foxtracs"};

    String[] OwnerName ={"mojombo","wycats", "rubinius","mojombo", "vanpelt","wycats", "defunkt","defunkt", "technoweenie","technoweenie", "MDQ6VXNlcjI1","anotherjesse", "anotherjesse","anotherjesse"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NameAdapter adapter=new NameAdapter(this, RepoName, OwnerName);
        view=(ListView)findViewById(List);
        view.setAdapter(adapter);


        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int location, long id) {

                if (location == 0) {
                    //code of first list item
                    Toast.makeText(getApplicationContext(), "Put the First Code", Toast.LENGTH_SHORT).show();
                } else if (location == 1) {
                    //code of 2nd list item
                    Toast.makeText(getApplicationContext(), "Put the  Second  Code", Toast.LENGTH_SHORT).show();
                } else if (location == 2) {
                    //code of third list item
                    Toast.makeText(getApplicationContext(), "Put the Third Code", Toast.LENGTH_SHORT).show();
                } else if (location == 3) {
                    //code of forth list item
                    Toast.makeText(getApplicationContext(), "Put the Forth Code", Toast.LENGTH_SHORT).show();
                } else if (location == 4) {
                    //code of fifth list item
                    Toast.makeText(getApplicationContext(), "Put the Fifth Code", Toast.LENGTH_SHORT).show();
                } else if (location == 5) {
                    //code of sixth list item
                    Toast.makeText(getApplicationContext(), "Put the Sixth Code", Toast.LENGTH_SHORT).show();
                } else if (location == 6) {
                    //code of seventh list item
                    Toast.makeText(getApplicationContext(), "Put the seventh Code", Toast.LENGTH_SHORT).show();
                } else if (location == 7) {
                    //code of eighth list item
                    Toast.makeText(getApplicationContext(), "Put the Eighth Code", Toast.LENGTH_SHORT).show();
                } else if (location == 8) {
                    //code of ninth list item
                    Toast.makeText(getApplicationContext(), "Put the ninth Code", Toast.LENGTH_SHORT).show();
                } else if (location == 9) {
                    //code of tenth list item
                    Toast.makeText(getApplicationContext(), "Put the tenth Code", Toast.LENGTH_SHORT).show();

                }
            }


        });
    }
}
