package com.example.talrota.post_pc_ex3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button async_button = findViewById(R.id.button_async);
        Button threads_button = findViewById(R.id.button_threads);
        async_button.setOnClickListener(this);
        threads_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_async:
                Intent intentAsync = new Intent(this, AsyncActivity.class);
                startActivity(intentAsync);
                break;
            case R.id.button_threads:
                Intent intentThreads = new Intent(this, ThreadsActivity.class);
                startActivity(intentThreads);
                break;
        }
    }
}
