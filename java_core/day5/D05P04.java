package com.learning.core.day5;

import java.util.HashSet;
import java.util.Scanner;

class Product1 {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
}

public class D05P04 {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();

        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto"));

        Scanner scanner = new Scanner(System.in);      
        String prodId = scanner.nextLine();      
        String prodCompany = scanner.nextLine();
        String prodModel = scanner.nextLine();
        scanner.close();

        Product searchProduct = new Product(prodId, prodCompany + " " + prodModel);
        if (productSet.contains(searchProduct)) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}
