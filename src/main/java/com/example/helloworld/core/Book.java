package com.example.helloworld.core;


public class Book {
    private final String name;
    private final String price;

    public Book(String name, String price) {
        this.name = name;
        this.price = price;
    }
    public String getName()
    {
        return name;
    }
    public String getPrice()
    {
        return price;
    }
    @Override
    public String toString()
    {
        return name+"|"+price;
    }
}
