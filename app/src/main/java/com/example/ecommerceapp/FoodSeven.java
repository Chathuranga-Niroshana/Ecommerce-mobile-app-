package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FoodSeven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_seven);

        Button addToCartButton = findViewById(R.id.addToCartButton);

        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemId = "unique_item_id_7";
                String itemName = "Piada";
                double itemPrice = 21.55;
                int itemImageResourceId = R.drawable.paida;

                CartItem cartItem = new CartItem(itemId, itemName, itemPrice, itemImageResourceId);
                Cart.addItemToCart(cartItem);

                Toast.makeText(FoodSeven.this, "Item added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
