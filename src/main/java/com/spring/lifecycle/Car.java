package com.spring.lifecycle;

public class Car {
    private int price;

    public Car() {
        super();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("Setting price");
        this.price = price;
    }
    public void init(){
        System.out.println("Starting");
    }
    public void destroy(){
        System.out.println("Killing");
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }
}
