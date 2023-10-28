package com.example.petallies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        ImageView announcementBanner = findViewById(R.id.announcementBanner);
        ImageView imageProduct = findViewById(R.id.imageProduct);
        ImageView imageServices = findViewById(R.id.imageServices);
        ImageView imageProfile = findViewById(R.id.imageProfile);
        ImageView imageAboutUs = findViewById(R.id.imageAboutUs);

        String urlAnnouncementBanner = (String) announcementBanner.getTag();
        String urlProduct = (String) imageProduct.getTag();
        String urlServices = (String) imageServices.getTag();
        String urlProfile = (String) imageProfile.getTag();
        String urlAboutUs = (String) imageAboutUs.getTag();

        Picasso.get()
                .load(urlAnnouncementBanner)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(announcementBanner);

        Picasso.get()
                .load(urlProduct)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(imageProduct);

        Picasso.get()
                .load(urlServices)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(imageServices);

        Picasso.get()
                .load(urlProfile)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(imageProfile);

        Picasso.get()
                .load(urlAboutUs)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(imageAboutUs);



    }
}
