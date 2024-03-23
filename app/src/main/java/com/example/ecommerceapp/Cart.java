package com.example.ecommerceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Cart extends AppCompatActivity {

    private RecyclerView cartRecyclerView;
    private Button nextButton;
    private static TextView totalPriceTextView;
    private static TextView totalPriceText; // Added reference to the new TextView
    private static List<CartItem> cartItems = new ArrayList<>();
    private static CartAdapter cartAdapter; // Made cartAdapter static

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        cartRecyclerView = findViewById(R.id.cart_list);
        nextButton = findViewById(R.id.next_btn);
        totalPriceTextView = findViewById(R.id.total_price_text);
        totalPriceText = findViewById(R.id.total_price_text); // Initialize the new TextView

        cartAdapter = new CartAdapter(cartItems);

        cartRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        cartRecyclerView.setAdapter(cartAdapter);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CheckoutIntent = new Intent(Cart.this, Checkout.class);
                startActivity(CheckoutIntent);
            }
        });

        updateTotalPrice();
    }

    public static void addItemToCart(CartItem cartItem) {
        cartItems.add(cartItem);
        // Notify the adapter that an item is inserted
        if (cartAdapter != null) {
            cartAdapter.notifyItemInserted(cartItems.size() - 1);
        }
        updateTotalPrice();
    }

    public static List<CartItem> getCartItems() {
        return cartItems;
    }

    private static void updateTotalPrice() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getItemPrice();
        }
        totalPriceTextView.setText("Total Price: $" + total);
        totalPriceText.setText("Total Price: $" + total);
    }
}
