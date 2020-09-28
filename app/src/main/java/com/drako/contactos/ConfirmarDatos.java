package com.drako.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmarDatos extends AppCompatActivity {
    TextView etNombre, etDatos, etEmail, etTelefono;

    DatePicker etFecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        etNombre = findViewById(R.id.ncompleto);
        etDatos = findViewById(R.id.etDatos);
        etEmail = findViewById(R.id.etEmail);
        etTelefono = findViewById(R.id.etTelefono);

        //etFecha = findViewById(R.id.etFecha);
        Button btnGet = (Button) findViewById(R.id.button);
        //TextView fecha;
        String nombre = getIntent().getStringExtra("nombre");
        String fecha = getIntent().getStringExtra("fecha");
        String telefono = getIntent().getStringExtra("telefono");
        String email = getIntent().getStringExtra("email");
        String datos = getIntent().getStringExtra("datos");

        //String datos = getIntent().getExtras("datos");
        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);///
        TextView tvEmail = (TextView) findViewById(R.id.tvEmail);///
        TextView tvTelefono = (TextView) findViewById(R.id.tvTelefono);///
        TextView tvDatos = (TextView) findViewById(R.id.tvDatos);///
        TextView tvFecha = (TextView) findViewById(R.id.tvFecha);
       // fecha.setText(picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear());

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDatos.setText(datos);

    }
    public void onClickBtn(View v) {
        //String nombre = etNombre.getText().toString();

        //String datos = etDatos.getText().toString();
        //String email = etEmail.getText().toString();
       // String telefono = etTelefono.getText().toString();
        //String fecha = etFecha.getDayOfMonth()+"/"+ (etFecha.getMonth() + 1)+"/"+etFecha.getYear();
       // Toast.makeText(this, nombre, Toast.LENGTH_LONG).show();
        this.finish();

        //Intent editar = new Intent(this, MainActivity.class);
        //editar.putExtra("nombre", nombre);

        //startActivity(editar);
        //finish();
    }
}
