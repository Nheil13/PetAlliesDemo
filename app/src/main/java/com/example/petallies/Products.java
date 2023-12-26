package com.example.petallies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class Products extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        ImageView cats = findViewById(R.id.cat_category);
        ImageView dogs = findViewById(R.id.dog_category);
        ImageView vitamins = findViewById(R.id.vitaminSupplement_category);
        ImageView essentials = findViewById(R.id.otherEssentials_category);

        String urlCatCategory = (String) cats.getTag();
        String urlDogCategory = (String) dogs.getTag();
        String urlVitaminsCategory = (String) vitamins.getTag();
        String urlOtherEssentials = (String) essentials.getTag();

        Picasso.get()
                .load(urlCatCategory)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(cats);

        Picasso.get()
                .load(urlDogCategory)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(dogs);

        Picasso.get()
                .load(urlVitaminsCategory)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(vitamins);

        Picasso.get()
                .load(urlOtherEssentials)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(essentials);
    }
}