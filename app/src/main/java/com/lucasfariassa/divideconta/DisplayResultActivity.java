package com.lucasfariassa.divideconta;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        Intent intent = getIntent();
        String value = intent.getStringExtra(MainActivity.EXTRA_VALUE);

        TextView textView = findViewById(R.id.displayresult_value);
        textView.setText(value);
    }


}
