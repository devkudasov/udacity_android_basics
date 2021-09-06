package com.kudasov.dev.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private final int PRICE = 5;
    private final int CREAM_PRICE = 1;
    private final int CHOCOLATE_PRICE = 2;

    private int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        displayMessage(createOrderSummary());
    }

    private String createOrderSummary() {
        boolean hasCream = ((CheckBox) findViewById(R.id.whippedCreamCheckbox)).isChecked();
        boolean hasChocolate = ((CheckBox) findViewById(R.id.chocolateCheckbox)).isChecked();

        String message = "Name: " + ((EditText) findViewById(R.id.name)).getText();
        message += "\nAdd whipped cream? " + hasCream;
        message += "\nAdd chocolate? " + hasChocolate;
        message += "\nQuantity: " + quantity;
        message += "\nTotal: " + NumberFormat.getCurrencyInstance().format(getPrice(hasCream, hasChocolate));
        message += "\nThank you!";

        return message;
    }

    private int getPrice(boolean hasCream, boolean hasChocolate) {
        int price = PRICE;

        if (hasCream) {
            price += CREAM_PRICE;
        }
        if (hasChocolate) {
            price += CHOCOLATE_PRICE;
        }

        return price * quantity;
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary);
        priceTextView.setText(message);
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

    private void displayQuantity() {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_count);
        quantityTextView.setText(getString(R.string.quantity, quantity));
    }
}