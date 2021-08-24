package com.kudasov.dev.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        displayQuantity(2);
        displayPrice(2 * 5);
    }

    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_count);
        quantityTextView.setText(getString(R.string.quantity, number));
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_count);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}