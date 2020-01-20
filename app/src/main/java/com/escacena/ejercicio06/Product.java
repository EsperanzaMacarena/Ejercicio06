package com.escacena.ejercicio06;

public class Product {
    private String product;
    private int rating;
    private String soldBy;
    private String photoProduct;
    private int price;
    private String amazonChoice;
    private String delivery;
    private int commentsNumber;
    private int deliveryPrice;

    public Product(String product, int rating, String soldBy, int price,int deliveryPrice, String amazonChoice, String delivery, int commentsNumber, String photoProduct) {
        this.product = product;
        this.rating = rating;
        this.soldBy = soldBy;
        this.price = price;
        this.deliveryPrice=deliveryPrice;
        this.amazonChoice = amazonChoice;
        this.delivery = delivery;
        this.commentsNumber = commentsNumber;
        this.photoProduct = photoProduct;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAmazonChoice() {
        return amazonChoice;
    }

    public void setAmazonChoice(String amazonChoice) {
        this.amazonChoice = amazonChoice;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public void setCommentsNumber(int commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public int getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(int deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public String getPhotoProduct() {
        return photoProduct;
    }

    public void setPhotoProduct(String photoProduct) {
        this.photoProduct = photoProduct;
    }

    @Override
    public String toString() {
        return "Producto de amazon{" +
                " product='" + product + '\'' +
                ", rating='" + rating + '\'' +
                ", soldBy='" + soldBy + '\'' +
                ", price='" + price + '\'' +
                ", amazonChoice='" + amazonChoice + '\'' +
                ", delivery='" + delivery + '\'' +
                ", commentsNumber='" + commentsNumber + '\'' +
                ", deliveryPrice='" + deliveryPrice + '\'' +
                '}';
    }

}
