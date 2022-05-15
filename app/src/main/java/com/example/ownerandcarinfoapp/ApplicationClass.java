package com.example.ownerandcarinfoapp;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{

    public static ArrayList<car> cars;

    @Override
    public void onCreate() {
        super.onCreate();

        cars = new ArrayList<car>();
        car c1 = new car("volkawagen", "Polo", "Hritvik Gupta", "9664033653");
        car c2 = new car("nissan", "Ignite", "Hritvik Gupta", "9664033653");
        car c3 = new car("mercedes", "Something", "Harshit Paliwal", "82300283");
        car c4 = new car("nissan", "something", "Aman thakur", "34234242");
        car c5 = new car("volkawagen", "Polo", "Jinkal Nagda", "343242342");

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);


    }
}
