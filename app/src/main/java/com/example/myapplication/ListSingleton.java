package com.example.myapplication;

import android.content.res.Resources;
import java.util.ArrayList;

class ListSingleton {

    ArrayList<myObject> text;
    ArrayList<myObject> textPassed = new ArrayList<>();

    private static final ListSingleton ourInstance = new ListSingleton();

    static ListSingleton getInstance() {
        return ourInstance;
    }



    private ListSingleton() {

        text = new ArrayList<>();

        text.add(new myObject(1, Resources.getSystem().getString(R.string.string1)));
        text.add(new myObject(2, Resources.getSystem().getString(R.string.string1)));
        text.add(new myObject(3, Resources.getSystem().getString(R.string.string1)));
        text.add(new myObject(4, Resources.getSystem().getString(R.string.string1)));
        text.add(new myObject(5, Resources.getSystem().getString(R.string.string1)));

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
