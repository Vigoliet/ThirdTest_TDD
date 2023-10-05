package org.example;

import java.util.List;

public class Order {

    public int orderNr;
    public Customer customer;
    public List<Product> products;
    public String orderDate;

    public Order(int orderNr, Customer customer, List<Product> products, String orderDate) {
        this.orderNr = orderNr;
        this.customer = customer;
        this.products = products;
        this.orderDate = orderDate;
    }

    public int getOrderNr() {
        return orderNr;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getOrderDate() {
        return orderDate;
    }


    //method to get all the full price that we later check in the test
    public double getFullPrice(){
        double totalSum = 0;
        for (int i = 0; i < products.size(); i++) {
            double price = products.get(i).getPrice();
            totalSum=totalSum+price;
        }
        return totalSum;
    }
}
