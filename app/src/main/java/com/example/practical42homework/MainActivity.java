package com.example.practical42homework;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public boolean first,second,third,forth,fifth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_toast(View view)
    {
        StringBuffer toppings = new
                StringBuffer().append(getString(R.string.toast_text));
        if  (first) {
            toppings.append(" "+getString(R.string.chocolate_syrup_text));
        }
        if  (second) {
            toppings.append(" "+getString(R.string.sprinkles_text));
        }
        if  (third) {
            toppings.append(" "+getString(R.string.crushed_nuts_text));
        }
        if  (forth) {
            toppings.append(" "+getString(R.string.cherries_text));
        }
        if  (fifth) {
            toppings.append(" "+getString(R.string.orio_cookie_crumbles_text));
        }
        String toast_message = toppings.toString();
        Toast toast = Toast.makeText(this,toast_message,Toast.LENGTH_SHORT);
        toast.show();

    }

    public void onSubmit(View view) {


        if  (((CheckBox) findViewById(R.id.chocolate_syrup_box)).isChecked()) {
            first = true;
        }else {
            first = false;
        }

        if  (((CheckBox) findViewById(R.id.sprinkles_box)).isChecked()) {
          second = true;
        }else {
            second = false;
        }

        if  (((CheckBox) findViewById(R.id.crushed_nuts_box)).isChecked()) {
            third = true;
        }else {
            third = false;
        }

        if  (((CheckBox) findViewById(R.id.cherries_box)).isChecked()) {
            forth = true;
        }else {
            forth = false;
        }

        if  (((CheckBox) findViewById(R.id.orio_box)).isChecked()) {
            fifth = true;
        }else {
            fifth = false;
        }

    }
}