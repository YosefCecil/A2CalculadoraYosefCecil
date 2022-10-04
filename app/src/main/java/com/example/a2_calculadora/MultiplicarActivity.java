package com.example.a2_calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MultiplicarActivity extends AppCompatActivity {

    private Button btnRegresar;
    private Button btnResultado;
    private EditText txtN1;
    private EditText txtN2;
    private TextView txtResultado;

    private double numero1 = 0;
    private double numero2 = 0;
    private double resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);

        btnRegresar = findViewById(R.id.btnRegresar);
        btnResultado = findViewById(R.id.btnResultado);
        txtN1 = (EditText) findViewById(R.id.txtN1);
        txtN2 = (EditText) findViewById(R.id.txtN2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MultiplicarActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = Integer.valueOf(txtN1.getText().toString());
                numero2 = Integer.valueOf(txtN2.getText().toString());

                resultado = numero1 * numero2;

                txtResultado.setText(""+ resultado);
            }
        });

    }
}