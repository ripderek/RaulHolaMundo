package com.example.raulholamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Crear una funcion para el boton xd
    //Onlick para enviar desde el boton
    public void  btnEnviar(View view){
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        Toast.makeText(this.getApplicationContext(), "Hola "+ txtNombre.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}