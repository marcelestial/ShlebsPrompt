package com.example.mal.shlebsprompt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.Arrays;

public class CharSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CharActivity.characters = new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_select);
    }

    public void onChecked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){
            case R.id.check1:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.assorted_chars)));
                }
                break;
            case R.id.check2:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.pjo_chars)));
                }
                break;
            case R.id.check3:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.da_chars)));
                }
                break;
            case R.id.check4:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.free_chars)));
                }
                break;
            case R.id.check5:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.homestuck_chars)));
                }
                break;
            case R.id.check6:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.marvel_chars)));
                }
                break;
            case R.id.check7:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.orig_chars)));
                }
                break;
            case R.id.check8:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.overwatch_chars)));
                }
                break;
            case R.id.check9:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.sense8_chars)));
                }
                break;
            case R.id.check10:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.su_chars)));
                }
                break;
            case R.id.check11:
                if(checked){
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.tolkien_chars)));
                }
                break;
        }
    }
}
