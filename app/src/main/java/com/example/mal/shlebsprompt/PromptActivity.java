package com.example.mal.shlebsprompt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class PromptActivity extends Activity {

    private Random generator;
    private List<String> prompts;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt);

        generator = new Random(System.currentTimeMillis());

        //a list of drawing prompts centered around a character
        prompts = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.prompts_list)));

        generatePrompt(findViewById(R.id.prompt_text_view));
    }


    private void displayPrompt(String prompt) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.prompt_text_view);
        quantityTextView.setText(prompt);
    }

    //displays a new randomly selected prompt
    public void generatePrompt(View view) {
        String prompt;

        int i = generator.nextInt(prompts.size());
        prompt = prompts.get(i);

        displayPrompt(prompt);
    }
}