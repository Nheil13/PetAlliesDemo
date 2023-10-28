package com.example.petallies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);
        ImageView announcementBanner = findViewById(R.id.announcementBanner);
        ImageView imageLocation = findViewById(R.id.imageLocation);
        ImageView imageContacts = findViewById(R.id.imageContacts);
        ImageView imageEmail = findViewById(R.id.imageEmail);
        ImageView imageFacebook = findViewById(R.id.imageFacebook);

        String urlAnnouncementBanner = (String) announcementBanner.getTag();
        String urlLocationImage = (String) imageLocation.getTag();
        String urlContacts = (String) imageContacts.getTag();
        String urlEmail = (String) imageEmail.getTag();
        String urlFacebook = (String) imageFacebook.getTag();

        Picasso.get()
                .load(urlAnnouncementBanner)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(announcementBanner);

        Picasso.get()
                .load(urlLocationImage)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(imageLocation);

        Picasso.get()
                .load(urlContacts)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(imageContacts);

        Picasso.get()
                .load(urlEmail)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(imageEmail);

        Picasso.get()
                .load(urlFacebook)
                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE) // Pumipigil sa memory caching
                .networkPolicy(NetworkPolicy.NO_CACHE) // Pumipigil sa network caching
                .into(imageFacebook);
    }
}
