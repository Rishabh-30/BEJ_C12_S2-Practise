package org.niit;

public class Product {
    private int productId;
    private String productName;
    private String price;
    private String color;
    private String size;

    public Product(int productId, String productName, String price, String color, String size) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
