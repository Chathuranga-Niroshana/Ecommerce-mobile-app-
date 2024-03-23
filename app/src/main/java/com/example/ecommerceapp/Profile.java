package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class Profile extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Get reference to the TextView
        TextView profileTitleTextView = findViewById(R.id.profileTitle);

        // You can customize the profile information or load user data here
        // For example:
        // profileTitleTextView.setText("Welcome, " + user.getName());
    }
}
