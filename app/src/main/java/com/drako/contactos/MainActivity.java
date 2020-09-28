package com.drako.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    DatePicker etFecha;
    TextInputLayout etDatos, etNombre, etEmail, etTelefono;
    private TextInputEditText mDisplayName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNombre = findViewById(R.id.ncompleto);
        etDatos =  findViewById(R.id.etDatos);
        etEmail = findViewById(R.id.etEmail);
        etTelefono = findViewById(R.id.etTelefono);
        etFecha = findViewById(R.id.etFecha);

        //etNombre = (TextInputLayout)findViewById(R.id.ncompleto);
        //String strNombre = getIntent().getStringExtra("nombre");
        //etNombre.setHint(strNombre);
        //Toast.makeText(this, strNombre, Toast.LENGTH_LONG).show();
        //mDisplayName = (TextInputEditText)findViewById(R.id.ncompleto);
        //strNombre = mDisplayName.getText().toString();
        //EditText etNombre = (TextInputEditText)findViewById(R.id.ncompleto);
        //Toast.makeText(this, strNombre, Toast.LENGTH_LONG).show();
        //EditText etNombre = findViewById(R.id.ncompleto);
        //etNombre.setText(strNombre);
        Button btnGet = (Button) findViewById(R.id.button);
        //Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
        //startActivities(intent);
    }

    //btnGet.setOnClickListener(new View.OnClickListener() {
    public void onClickBtn(View v) {

        String nombre = etNombre.getEditText().getText().toString();
        String datos = etDatos.getEditText().getText().toString();
        String email = etEmail.getEditText().getText().toString();
        String telefono = etTelefono.getEditText().getText().toString();
        String fecha = etFecha.getDayOfMonth()+"/"+ (etFecha.getMonth() + 1)+"/"+etFecha.getYear();
        //Toast.makeText(this, fecha, Toast.LENGTH_LONG).show();


        Intent intent = new Intent(this, ConfirmarDatos.class);
        intent.putExtra("nombre", etNombre.getEditText().getText().toString());
        intent.putExtra("fecha", etFecha.getDayOfMonth()+"/"+ (etFecha.getMonth() + 1)+"/"+etFecha.getYear());
        //picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear()
        intent.putExtra("datos", datos);
        intent.putExtra("email", etEmail.getEditText().getText().toString());
        intent.putExtra("telefono", etTelefono.getEditText().getText().toString());
        //TextView prueba = (TextView) findViewById(R.id.ncompleto);
        startActivity(intent);
    }
//}

}