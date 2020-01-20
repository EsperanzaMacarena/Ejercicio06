package com.escacena.ejercicio06;

public class Product {
    private String product;
    private String rating;
    private String soldBy;
    private float price;
    private String amazonChoice;
    private String delivery;
    private int commentsNumber;
    private float deliveryPrice;

    public Product(String product, String rating, String soldBy, float price,float deliveryPrice, String amazonChoice, String delivery, int commentsNumber) {
        this.product = product;
        this.rating = rating;
        this.soldBy = soldBy;
        this.price = price;
        this.deliveryPrice=deliveryPrice;
        this.amazonChoice = amazonChoice;
        this.delivery = delivery;
        this.commentsNumber = commentsNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
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

    public float getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(float deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
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
