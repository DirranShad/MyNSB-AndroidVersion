package com.thing.tomato.thehub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread loading = new Thread(){
            @Override
            public void run() {
                try {
                    int numChoice = splashChoice.choice;
                    sleep(5000);
                    if (numChoice == 0) {
                        Intent intent = new Intent(getApplicationContext(), Login.class);
                        startActivity(intent);
                        finish();
                    }else if(numChoice == 1){
                        Intent intent = new Intent(getApplicationContext(), homePage.class);
                        startActivity(intent);
                        finish();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        loading.start();
    }

}
