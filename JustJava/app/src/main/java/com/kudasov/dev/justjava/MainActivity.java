package com.kudasov.dev.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    public int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        displayQuantity();
        displayPrice( 5);
    }

    private void displayQuantity() {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_count);
        quantityTextView.setText(getString(R.string.quantity, quantity));
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_count);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format((long) quantity * number));
    }

    public void increment(View view) {
        quantity++;
        displayQuantity();
    }

    public void decrement(View view) {
        if (quantity > 0) {
            quantity--;
            displayQuantity();
        }
    }
}