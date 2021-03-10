package com.jecesario.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox opcaoIngles, opcaoEspanhol, opcaoAvista;
    private double valor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opcaoIngles = findViewById(R.id.cbIngles);
        opcaoEspanhol = findViewById(R.id.cbEspanhol);
        opcaoAvista = findViewById(R.id.cbAvista);

    }

    public void onClick(View view) {
        boolean checkIngles = opcaoIngles.isChecked();
        boolean checkEspanhol = opcaoEspanhol.isChecked();
        boolean checkAvista = opcaoAvista.isChecked();

        if(checkIngles && checkEspanhol) {
            valor = 2400;
        } else {
            if(checkIngles) {
                valor = 1614;
            } else if(checkEspanhol) {
                valor = 1200;
            }
        }

        if(checkAvista) {
            valor -= valor * 0.1;
        }

        Toast.makeText(this, "O valor do curso é R$" + valor, Toast.LENGTH_SHORT).show();
    }
}