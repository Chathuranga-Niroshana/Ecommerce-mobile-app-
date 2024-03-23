package com.example.ecommerceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    private Cart cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Get references to the buttons
        Button cartButton = findViewById(R.id.cart_button);
        Button searchButton = findViewById(R.id.search_button);
        ImageButton profileButton = findViewById(R.id.profile_button);

        // Set click listeners for the buttons
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cartIntent = new Intent(Home.this, Cart.class);
                startActivity(cartIntent);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the profile activity
                Intent profileIntent = new Intent(Home.this, Profile.class);
                startActivity(profileIntent);
            }
        });

        cart = new Cart();

        ImageButton foodButton1 = findViewById(R.id.food_button_1);
        ImageButton foodButton2 = findViewById(R.id.food_button_2);
        ImageButton foodButton4 = findViewById(R.id.food_button_4);
        ImageButton foodButton5 = findViewById(R.id.food_button_5);
        ImageButton foodButton6 = findViewById(R.id.food_button_6);
        ImageButton foodButton7 = findViewById(R.id.food_button_7);
        ImageButton foodButton8 = findViewById(R.id.food_button_8);
        ImageButton foodButton9 = findViewById(R.id.food_button_9);
        ImageButton foodButton10 = findViewById(R.id.food_button_10);

        foodButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodOneIntent = new Intent(Home.this, FoodOne.class);
                startActivity(foodOneIntent);
            }
        });
        foodButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodTwoIntent = new Intent(Home.this, FoodTwo2.class);
                startActivity(foodTwoIntent);
            }
        });
        foodButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodThreeIntent = new Intent(Home.this, FoodThree.class);
                startActivity(foodThreeIntent);
            }
        });
        foodButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodTwoIntent = new Intent(Home.this, FoodTwo2.class);
                startActivity(foodTwoIntent);
            }
        });
        foodButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodFiveIntent = new Intent(Home.this, FoodFive.class);
                startActivity(foodFiveIntent);
            }
        });
        foodButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodSixIntent = new Intent(Home.this, FoodSix.class);
                startActivity(foodSixIntent);
            }
        });
        foodButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodSixIntent = new Intent(Home.this, FoodSix.class);
                startActivity(foodSixIntent);
            }
        });
        foodButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodSevenIntent = new Intent(Home.this, FoodSeven.class);
                startActivity(foodSevenIntent);
            }
        });
        foodButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodOneIntent = new Intent(Home.this, FoodOne.class);
                startActivity(foodOneIntent);
            }
        });
    }
}
