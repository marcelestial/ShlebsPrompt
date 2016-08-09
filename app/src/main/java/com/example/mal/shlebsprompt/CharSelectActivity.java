package com.example.mal.shlebsprompt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.Arrays;

public class CharSelectActivity extends AppCompatActivity {

    //a global variable to keep track of which boxes are selected
    //when the activity is paused and resumed
    static boolean[] checks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CharActivity.characters = new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_select);

        if (checks == null) {
            checks = new boolean[11];
        } else {
            restoreChecks(checks);
        }
    }

    public void restoreChecks(boolean[] checks){
        CheckBox check1 = (CheckBox) findViewById(R.id.check1);
        CheckBox check2 = (CheckBox) findViewById(R.id.check2);
        CheckBox check3 = (CheckBox) findViewById(R.id.check3);
        CheckBox check4 = (CheckBox) findViewById(R.id.check4);
        CheckBox check5 = (CheckBox) findViewById(R.id.check5);
        CheckBox check6 = (CheckBox) findViewById(R.id.check6);
        CheckBox check7 = (CheckBox) findViewById(R.id.check7);
        CheckBox check8 = (CheckBox) findViewById(R.id.check8);
        CheckBox check9 = (CheckBox) findViewById(R.id.check9);
        CheckBox check10 = (CheckBox) findViewById(R.id.check10);
        CheckBox check11 = (CheckBox) findViewById(R.id.check11);

        if(checks[0]) {
            check1.setChecked(true);
            onChecked(check1);
        }
        if(checks[1]) {
            check2.setChecked(true);
            onChecked(check2);
        }
        if(checks[2]) {
            check3.setChecked(true);
            onChecked(check3);
        }
        if(checks[3]) {
            check4.setChecked(true);
            onChecked(check4);
        }
        if(checks[4]) {
            check5.setChecked(true);
            onChecked(check5);
        }
        if(checks[5]) {
            check6.setChecked(true);
            onChecked(check6);
        }
        if(checks[6]) {
            check7.setChecked(true);
            onChecked(check7);
        }
        if(checks[7]) {
            check8.setChecked(true);
            onChecked(check8);
        }
        if(checks[8]) {
            check9.setChecked(true);
            onChecked(check9);
        }
        if(checks[9]) {
            check10.setChecked(true);
            onChecked(check10);
        }
        if(checks[10]) {
            check11.setChecked(true);
            onChecked(check11);
        }
    }

    public void onChecked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){
            case R.id.check1:
                if(checked){
                    checks[0] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.assorted_chars)));
                }
                else {
                    checks[0] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.assorted_chars)));
                }
                break;
            case R.id.check2:
                if(checked){
                    checks[1] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.pjo_chars)));
                }
                else {
                    checks[1] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.pjo_chars)));
                }
                break;
            case R.id.check3:
                if(checked){
                    checks[2] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.da_chars)));
                }
                else {
                    checks[2] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.da_chars)));
                }
                break;
            case R.id.check4:
                if(checked){
                    checks[3] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.free_chars)));
                }
                else {
                    checks[3] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.free_chars)));
                }
                break;
            case R.id.check5:
                if(checked){
                    checks[4] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.homestuck_chars)));
                }
                else {
                    checks[4] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.homestuck_chars)));
                }
                break;
            case R.id.check6:
                if(checked){
                    checks[5] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.marvel_chars)));
                }
                else {
                    checks[5] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.marvel_chars)));
                }
                break;
            case R.id.check7:
                if(checked){
                    checks[6] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.orig_chars)));
                }
                else {
                    checks[6] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.orig_chars)));
                }
                break;
            case R.id.check8:
                if(checked){
                    checks[7] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.overwatch_chars)));
                }
                else {
                    checks[7] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.overwatch_chars)));
                }
                break;
            case R.id.check9:
                if(checked){
                    checks[8] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.sense8_chars)));
                }
                else {
                    checks[8] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.sense8_chars)));
                }
                break;
            case R.id.check10:
                if(checked){
                    checks[9] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.su_chars)));
                }
                else {
                    checks[9] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.su_chars)));
                }
                break;
            case R.id.check11:
                if(checked){
                    checks[10] = true;
                    CharActivity.characters.addAll(Arrays.asList
                            (getResources().getStringArray(R.array.tolkien_chars)));
                }
                else {
                    checks[10] = false;
                    CharActivity.characters.removeAll(Arrays.asList
                            (getResources().getStringArray(R.array.tolkien_chars)));
                }
                break;
        }
    }
}
