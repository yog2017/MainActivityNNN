package com.example.ideapad.myapplicationnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button abc = (Button)findViewById(R.id.search_close_btn);

        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // some code here type

                Toast.makeText(MainActivity.this, "Duplicate", Toast.LENGTH_SHORT).show();

            }
        });
        
    }
}
