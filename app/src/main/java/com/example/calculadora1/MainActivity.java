package com.example.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;
    TextView tResultado;
    Button btnSumar, btnRestar,btnDividir,btnMultiplicar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 =(EditText) findViewById(R.id.txtnumero1);
        numero2=(EditText) findViewById(R.id.txtnumero2);
        tResultado =findViewById(R.id.tResultado);

        btnSumar=(Button) findViewById(R.id.btnSuma);
        btnRestar =(Button) findViewById(R.id.btnResta);
        btnDividir= (Button) findViewById(R.id.btnDivi);
        btnMultiplicar=(Button) findViewById(R.id.btnMulti);

        btnSumar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               tResultado.setText(suma(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+" ");
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tResultado.setText(Resta(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+" ");
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tResultado.setText(Divicion(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+" ");
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tResultado.setText(Multi(Integer.parseInt(numero1.getText().toString()),Integer.parseInt(numero2.getText().toString()))+" ");
            }
        });



    }

    public int suma (int a, int b)
    {
        return a+b;
    }
    public int Resta (int a, int b)
    {
        return a-b;
    }
    public double Divicion (int a, int b)
    {
        int respuesta=0;
        if(b!=0)
        {
            respuesta=a/b;
        }
        return respuesta;

    }
    public int Multi (int a, int b)
    {
        return a*b;
    }
}