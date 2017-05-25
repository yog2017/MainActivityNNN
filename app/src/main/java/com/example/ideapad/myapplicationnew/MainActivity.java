package com.example.ideapad.myapplicationnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button abc = null;

        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                // some code here type 

                Toast.makeText(MainActivity.this, "orignal", Toast.LENGTH_SHORT).show();

            }
        });
        
    }
}
