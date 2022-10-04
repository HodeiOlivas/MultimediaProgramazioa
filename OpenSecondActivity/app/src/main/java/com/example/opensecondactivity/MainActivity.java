package com.example.opensecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private TextView tv2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv2 = (TextView)findViewById(R.id.tv2);

        String datu = getIntent().getStringExtra("datu");
        tv2.setText("Kaixo "+ datu);


        et1 = (EditText)findViewById(R.id.et1);
    }
    //Metodo boton enviar

    public void Enviar(View view){

        Intent i = new Intent(this,MainActivity2.class );
        i.putExtra("dato", et1.getText().toString());
        startActivity(i);

    }



}