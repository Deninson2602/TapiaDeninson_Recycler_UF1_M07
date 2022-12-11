package com.example.layoutbotonesdef;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class Formulario extends AppCompatActivity {

    ListView simpleListView;
    // array objects
    String courseList[] = {"getText(Nombre)", "getText(Apellido)", "getText(Teléfono)", "getText(Correo)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        TextView textView = (TextView)findViewById(R.id.textoppc);
        Spannable wordtoSpan = new SpannableString("Política de Privacidad: Chipping SA informa a los usuarios del sitio web lo siguiente. Los datos del tratamiento\n" +
                "y usos a los que se someten los datos de carácter personal que se recaban en la web son protegidos y tratados con el permiso del usuario.");

        wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 23, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLACK), 87, 113, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLACK), 200, 223, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(wordtoSpan);

        EditText editText = (EditText)findViewById(R.id.txtBasic);
        Spannable wordtoSpan2 = new SpannableString("Nombre");

        wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        editText.setHint(wordtoSpan2);

        simpleListView = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.item_view, R.id.itemTextView, courseList);
        simpleListView.setAdapter(arrayAdapter);

        //Obtener texto escrito de los editTexts para mostrarlos en el primer spinner
        //por hacer...

        Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.valores_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }
}