package com.lucasfariassa.divideconta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_VALUE = "com.lucasfariassa.divideconta.VALUE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendValues(View view) {
        Intent intent = new Intent(this, DisplayResultActivity.class);
        EditText totalAmountInserted = findViewById(R.id.main_insert_totalAmount);
        EditText participantsInserted = findViewById(R.id.main_insert_participants);
        double totalAmount = Double.parseDouble(totalAmountInserted.getText().toString());
        int participants = Integer.parseInt(participantsInserted.getText().toString());

        // Calcula e retorna o valor - Calculates and returns the value
        double result = Calculator.calculateValue(totalAmount, participants);

        // Transforma o resultado em String - Converts the result to String:
        String resultFormatted = Double.toString(result);

        // Envia o resultado e exibe na DisplayResultActivity
        // Send the result and display it in the DisplayResultActivity
        intent.putExtra(EXTRA_VALUE, resultFormatted);
        startActivity(intent);
    }
}