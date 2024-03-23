package com.example.ecommerceapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FoodOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_one);

        Button addToCartButton = findViewById(R.id.addToCartButton);

        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemId = "unique_item_id";
                String itemName = "Pizza";
                double itemPrice = 10.99;
                int itemImageResourceId = R.drawable.pizza; // Replace with your actual image resource

                CartItem cartItem = new CartItem(itemId, itemName, itemPrice, itemImageResourceId);
                Cart.addItemToCart(cartItem);

                Toast.makeText(FoodOne.this, "Item added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
