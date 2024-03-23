package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FoodFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_five);

        Button addToCartButton = findViewById(R.id.addToCartButton2);

        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemId = "unique_item_id_4";
                String itemName = "Turkey";
                double itemPrice = 21.34;
                int itemImageResourceId = R.drawable.turkeyfood;

                CartItem cartItem = new CartItem(itemId, itemName, itemPrice, itemImageResourceId);
                Cart.addItemToCart(cartItem);

                Toast.makeText(FoodFive.this, "Item added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
