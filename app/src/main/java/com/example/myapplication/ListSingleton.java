package com.example.myapplication;

import java.util.ArrayList;

class ListSingleton {
    private static final ListSingleton ourInstance = new ListSingleton();

    static ListSingleton getInstance() {
        return ourInstance;
    }

    ArrayList<myObject> text = new ArrayList<>();
    ArrayList<myObject> textPassed = new ArrayList<>();

    private ListSingleton() {

        text.add(new myObject(1, getString(R.string.string1)));
        text.add(new myObject(2, getString(R.string.string2)));
        text.add(new myObject(3, getString(R.string.string3)));
        text.add(new myObject(4, getString(R.string.string4)));
        text.add(new myObject(5, getString(R.string.string5)));
    }

    public ArrayList<myObject> getText() {
        return text;
    }

    public void setText(ArrayList<myObject> text) {
        this.text = text;
    }

    public ArrayList<myObject> getTextPassed() {
        return textPassed;
    }

    public void setTextPassed(ArrayList<myObject> textPassed) {
        this.textPassed = textPassed;
    }
}
