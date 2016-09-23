package com.example.ad36.lab03;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class lab03 extends AppCompatActivity {

    // Variables
    private EditText passwordField;
    private ImageView harambe;
    private TextView invalid;
    private SharedPreferences savedValues;
    private String passwordString = "";
    private String actualPassword = "ad36";

    // Function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab03);
        passwordField = (EditText) findViewById(R.id.pwfield);
        harambe = (ImageView) findViewById(R.id.harambe);
        harambe.setVisibility(View.GONE);
        invalid = (TextView) findViewById(R.id.invalid);
        invalid.setVisibility(View.GONE);

        // Create Listener for change in pw entry field
        passwordField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                passwordString = passwordField.getText().toString();
                if (passwordString.equals(actualPassword)){
                    harambe.setVisibility(View.VISIBLE);
                    invalid.setVisibility(View.GONE);
                } else {
                    harambe.setVisibility(View.GONE);
                    invalid.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });

    }
}
