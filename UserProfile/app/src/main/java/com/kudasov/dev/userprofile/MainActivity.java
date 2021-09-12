package com.kudasov.dev.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView nameTextView = findViewById(R.id.name);
        TextView birthdayTextView = findViewById(R.id.birthday);
        TextView countryTextView = findViewById(R.id.country);
        ImageView imageView = findViewById(R.id.profile_picture);

        nameTextView.setText("Kudasov Dima");
        birthdayTextView.setText("01/17/1988");
        countryTextView.setText("Belarus");
        imageView.setImageResource(R.drawable.bender_rodriguez);
    }
}