package com.example.fragmentsrv;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();
        people = new ArrayList<Person>();
        people.add(new Person("Chuck Noris","95462215651"));
        people.add(new Person("Abhishek Agarwal","6423154563"));
        people.add(new Person("Rohit Mehra","334511455400"));
        people.add(new Person("Sachin Mishra","546456542542"));
    }
}
