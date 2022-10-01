package com.example.android.ghanatouristapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

//        Set onClickListener for the button view
        Button launch = (Button) findViewById(R.id.launch_button);
        launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                OnClickListener calls intent to start the main activity
                Intent mainActivity = new Intent(FrontPageActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
}
