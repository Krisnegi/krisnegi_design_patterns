package com.designpattern;

public class SingletonExample {
    int id;
    String name;
    private SingletonExample(int id,String name)
    {
        // private constructor
        this.id=id;
        this.name=name;
    }

    // Inner class to provide instance of class
    private static class BillPughSingleton
    {
        private static final SingletonExample INSTANCE = new SingletonExample(1,"bill");
    }

    public static SingletonExample getInstance()
    {
        return BillPughSingleton.INSTANCE;
    }
}
