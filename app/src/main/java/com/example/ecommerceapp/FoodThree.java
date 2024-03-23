package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FoodThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_three);

        // Move the button initialization and click listener inside the onCreate method
        Button addToCartButton = findViewById(R.id.addToCartButton2);

        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemId = "unique_item_id_3";
                String itemName = "Ham Burger";
                double itemPrice = 12.48;
                int itemImageResourceId = R.drawable.pqr;

                CartItem cartItem = new CartItem(itemId, itemName, itemPrice, itemImageResourceId);
                Cart.addItemToCart(cartItem);

                Toast.makeText(FoodThree.this, "Item added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
