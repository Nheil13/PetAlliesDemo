package com.example.petallies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petallies.R;
import com.example.petallies.model.CategoryItem;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoryItemRecyclerAdapter extends RecyclerView.Adapter<CategoryItemRecyclerAdapter.CategoryItemViewHolder> {

    private Context context;
    private List<CategoryItem> categoryItemList;

    public CategoryItemRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.category_row_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, int position) {

        // Use Picasso to load the image from the URL into the ImageView
        Picasso.get().load(categoryItemList.get(position).getImageURL()).into(holder.itemImage, new Callback() {
            @Override
            public void onSuccess() {
                // Image loaded successfully, remove background
                holder.itemImage.setBackground(null); // or holder.itemImage.setBackgroundColor(Color.TRANSPARENT);
            }

            @Override
            public void onError(Exception e) {
                // Handle error if the image fails to load
            }
        });

        // Set productDescription and productPrice
        holder.productDescription.setText(categoryItemList.get(position).getProductDescription());
        holder.productPrice.setText(categoryItemList.get(position).getProductPrice());

    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public static final class CategoryItemViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView productDescription, productPrice;
        public CategoryItemViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.productImage);
            productDescription = itemView.findViewById(R.id.productDescription);
            productPrice = itemView.findViewById(R.id.productPrice);

        }
    }

}
