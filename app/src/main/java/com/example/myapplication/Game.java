package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Game extends AppCompatActivity {

    int randomNum = 0;
    myObject current;
    int totalString;
    TextView tv = findViewById(R.id.tv);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageView next = findViewById(R.id.bt_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeRound();
            }
        });
    }


    public int RandomNum() {
        ArrayList<myObject> text = ListSingleton.getInstance().getText();
        totalString = text.size();
        randomNum = 1 + (int) (Math.random() * ((totalString - 1) + 1));
        return randomNum;
    }

    public boolean checkPassed() {
        ArrayList<myObject> textPassed = ListSingleton.getInstance().getTextPassed();
        for (int i = 0; i < textPassed.size(); i++) {
            if (current.getId() != textPassed.get(i).getId()) {
                return true;
            }
        }
        return false;
    }

    public void makeRound() {
        int num = RandomNum();
        current = ListSingleton.getInstance().getTextPassed().get(num);
        boolean check = checkPassed();

        if (check) {
            tv.setText(current.getText());
            ArrayList<myObject> textPassed = ListSingleton.getInstance().getTextPassed();
            textPassed.add(current);
            ListSingleton.getInstance().setTextPassed(textPassed);
        } else {
            makeRound();
        }
    }
    
}
