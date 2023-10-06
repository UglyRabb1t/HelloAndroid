package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        // bind the button with the number
        Button btnPanel = (Button) findViewById(R.id.buttonPanel);
        TextView counterNumber = (TextView) findViewById(R.id.textView);

        btnPanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                counterNumber.setText(String.valueOf(count));
            }
        });

    }

}
