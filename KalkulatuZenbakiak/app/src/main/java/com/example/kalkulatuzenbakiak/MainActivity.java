package com.example.kalkulatuzenbakiak;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);



    }
    //Metodo kalkulua
    public void Kalkulatu(View view){

        Intent i = new Intent(this,SecondActivity.class );
        i.putExtra("textua", et1.getText().toString() + "+" + et2.getText().toString());
        startActivity(i);

        Intent a = new Intent(this,SecondActivity.class );
        i.putExtra("textua", et1 + et2);
        startActivity(a);






    }




}