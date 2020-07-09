package com.example.practical42homework;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public boolean one,two,three,four,five;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_toast(View view)
    {
        StringBuffer toppings = new
                StringBuffer().append(getString(R.string.toast_text));
        if  (one) {
            toppings.append(" "+getString(R.string.chocolate_syrup_text));
        }
        if  (two) {
            toppings.append(" "+getString(R.string.sprinkles_text));
        }
        if  (three) {
            toppings.append(" "+getString(R.string.crushed_nuts_text));
        }
        if  (four) {
            toppings.append(" "+getString(R.string.cherries_text));
        }
        if  (five) {
            toppings.append(" "+getString(R.string.orio_cookie_crumbles_text));
        }
        String toast_message = toppings.toString();
        Toast toast = Toast.makeText(this,toast_message,Toast.LENGTH_SHORT);
        toast.show();

    }

    public void onSubmit(View view) {


        if  (((CheckBox) findViewById(R.id.chocolate_syrup_box)).isChecked()) {
            one = true;
        }else {
            one = false;
        }

        if  (((CheckBox) findViewById(R.id.sprinkles_box)).isChecked()) {
            two = true;
        }else {
            two = false;
        }

        if  (((CheckBox) findViewById(R.id.crushed_nuts_box)).isChecked()) {
            three = true;
        }else {
            three = false;
        }

        if  (((CheckBox) findViewById(R.id.cherries_box)).isChecked()) {
            four = true;
        }else {
            four = false;
        }

        if  (((CheckBox) findViewById(R.id.orio_box)).isChecked()) {
            five = true;
        }else {
            five = false;
        }

    }
}