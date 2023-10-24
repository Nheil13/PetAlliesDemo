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

        String urlAnnouncementBanner = (String) announcementBanner.getTag();

        Picasso.get()
                .load(urlAnnouncementBanner)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(announcementBanner);



    }
}