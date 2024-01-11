package com.example.petallies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.petallies.adapter.MainRecyclerAdapter;
import com.example.petallies.model.AllCategory;
import com.example.petallies.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class CatProducts extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_products);

        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, "https://drive.google.com/uc?id=1p7qwomqcOwsxyqtGXfcddCYS8H04d7KG", "Royal Canin Gastrointestinal 2kg", "₱ 1,650"));
        categoryItemList.add(new CategoryItem(1, "https://drive.google.com/uc?id=15vuT1OzOz_DpDIGN5lwxlGpYlzZmYYJI", "Royal Canin Renal 2kg", "₱ 1,700"));
        categoryItemList.add(new CategoryItem(1, "https://drive.google.com/uc?id=1zrfpCPEvK_QAp_BCfXifKwAozANORdst", "Royal Canin Urinary S/O 2kg", "₱ 1,450"));

        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(2, "https://drive.google.com/uc?id=1Jxnm--I6OQWv_clR7L0kfqJPcMkv_G5J", "Brit Care Shiny Hair Snacks\nfor Cat", "₱ 95"));
        categoryItemList2.add(new CategoryItem(2, "https://drive.google.com/uc?id=1GC9OA1HXvmTXuadD3qU8dtNmSzFUQ0Xv", "Temptations Savoury\nSalmon Flavour", "₱ 120"));
        categoryItemList2.add(new CategoryItem(2, "https://drive.google.com/uc?id=1M1t1KDOiKvJiTrSTN8B12QurByrZWJhE", "Whiskas 2-12 Months Tuna\nFlavour 80g", "₱ 35"));

        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Adults", categoryItemList));
        allCategoryList.add(new AllCategory("Treats", categoryItemList2));


        setMainCategoryRecycler(allCategoryList);
    }

    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){

        mainCategoryRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);

    }
}