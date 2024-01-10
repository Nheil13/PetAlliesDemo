package com.example.petallies.model;

public class CategoryItem {

    Integer id;
    String imageURL;
    String productDescription;
    String productPrice;

    public CategoryItem(Integer id, String imageURL, String productDescription, String productPrice) {
        this.id = id;
        this.imageURL = imageURL;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
