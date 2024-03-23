package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FoodTwo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_two2);

        Button addToCartButton = findViewById(R.id.addToCartButton2);

        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemId = "unique_item_id_2";
                String itemName = "Burger";
                double itemPrice = 8.48;
                int itemImageResourceId = R.drawable.abc;

                CartItem cartItem = new CartItem(itemId, itemName, itemPrice, itemImageResourceId);
                Cart.addItemToCart(cartItem);

                Toast.makeText(FoodTwo2.this, "Item added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
