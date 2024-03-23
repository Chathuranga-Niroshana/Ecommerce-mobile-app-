package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FoodSix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_six);

        Button addToCartButton = findViewById(R.id.addToCartButton2);

        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemId = "unique_item_id_5";
                String itemName = "Turkey";
                double itemPrice = 20.99;
                int itemImageResourceId = R.drawable.turkey;

                CartItem cartItem = new CartItem(itemId, itemName, itemPrice, itemImageResourceId);
                Cart.addItemToCart(cartItem);

                Toast.makeText(FoodSix.this, "Item added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
