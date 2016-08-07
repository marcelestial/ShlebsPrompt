package com.example.mal.shlebsprompt;

        import android.app.Activity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Random;

public class CharActivity extends Activity{

    private Random generator;

    //the list of characters from active categories
    public static List<String> characters;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char);


        //the generator that will select a random character from the list, initialized
        generator = new Random(System.currentTimeMillis());

        generateCharacter(findViewById(R.id.charname_text_view));
    }

    private void displayName(String charname) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.charname_text_view);
        quantityTextView.setText(charname);
    }

    //displays a new randomly selected character name
    public void generateCharacter(View view){
        String character;

        if(characters.size() > 0) {
            int i = generator.nextInt(characters.size());
            character = characters.get(i);
            displayName(character);
        }
        else{
            displayName("No categories selected.");
        }

    }
}