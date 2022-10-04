package com.example.opensecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText et2;
    private TextView tv1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView)findViewById(R.id.tv1);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Kaixo "+ dato);


        et2 = (EditText)findViewById(R.id.et2);
    }

    public void Regresar(View view){



        Intent i = new Intent(this,MainActivity.class );

        startActivity(i);




    }
    public void Enviar(View view){

        Intent i = new Intent(this,MainActivity.class );
        i.putExtra("datu", et2.getText().toString());
        startActivity(i);

    }


}