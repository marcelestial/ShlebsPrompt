package com.example.mal.shlebsprompt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button characterButton = (Button) findViewById(R.id.char_button);
        Button situationButton = (Button) findViewById(R.id.sitch_button);
        Button categoryButton = (Button) findViewById(R.id.category_button);

        characterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CharActivity.class);
                startActivity(intent);
            }
        });

        situationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PromptActivity.class);
                startActivity(intent);
            }
        });

        categoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CharSelectActivity.class);
                startActivity(intent);
            }
        });
    }
}
