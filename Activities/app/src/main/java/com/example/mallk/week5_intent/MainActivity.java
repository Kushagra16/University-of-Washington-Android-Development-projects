package com.example.mallk.week5_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String MESSAGE = "com.example.mallk.week5_intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra(MESSAGE," THIS IS FROM MAIN ACTIVITY");
                startActivity(i);
            }
        });
    }
}
