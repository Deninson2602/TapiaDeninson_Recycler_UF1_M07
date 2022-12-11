package com.example.layoutbotonesdef;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class OhMyGod extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oh_my_god);

        recycler = findViewById(R.id.recView);
        //recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                //false));
        recycler.setLayoutManager(new GridLayoutManager(this, 3));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recycler.getContext(),
                LinearLayoutManager.VERTICAL);
        recycler.addItemDecoration(dividerItemDecoration);


        listDatos = new ArrayList<>();
        listDatos.add("Playstation 5");
        listDatos.add("      ");
        listDatos.add("499,95 €");
        listDatos.add("Gorro de navidad");
        listDatos.add("      ");
        listDatos.add("12,99 €");
        listDatos.add("Pista Hootwheels");
        listDatos.add("      ");
        listDatos.add("129,95 €");
        listDatos.add("iPhone 14 Pro Max");
        listDatos.add("      ");
        listDatos.add("1329,95 €");
        listDatos.add("Nintendo Switch OLED");
        listDatos.add("      ");
        listDatos.add("349,99 €");
        listDatos.add("Mesa Gaming RGB");
        listDatos.add("      ");
        listDatos.add("129, 95 €");
        listDatos.add("Conejo");
        listDatos.add("      ");
        listDatos.add("0,00 €");
        listDatos.add("BMW series 1 190CV");
        listDatos.add("      ");
        listDatos.add("9995,95 €");
        listDatos.add("Televisión 4k OLED");
        listDatos.add("      ");
        listDatos.add("3499,99 €");
        listDatos.add("Wii");
        listDatos.add("      ");
        listDatos.add("49,95 €");


        AdapterLista adapter = new AdapterLista(listDatos);
        recycler.setAdapter(adapter);

        //spinner
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.valores_array2, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        //spinner2
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.valores_array2, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);

        //spinner3
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.valores_array2, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);

        //spinner4
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner6);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
                R.array.valores_array2, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        //spinner5
        Spinner spinner6 = (Spinner) findViewById(R.id.spinner7);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,
                R.array.valores_array2, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);

        //spinner6
        Spinner spinner7 = (Spinner) findViewById(R.id.spinner8);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,
                R.array.valores_array2, android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter7);

        //spinner7
        Spinner spinner8 = (Spinner) findViewById(R.id.spinner9);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,
                R.array.valores_array2, android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter8);

        //spinner8
        Spinner spinner9 = (Spinner) findViewById(R.id.spinner10);
        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(this,
                R.array.valores_array2, android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(adapter9);

        //spinner9
        Spinner spinner10 = (Spinner) findViewById(R.id.spinner11);
        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(this,
                R.array.valores_array2, android.R.layout.simple_spinner_item);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner10.setAdapter(adapter10);

        //spinner10
        Spinner spinner11 = (Spinner) findViewById(R.id.spinner12);
        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(this,
                R.array.valores_array2, android.R.layout.simple_spinner_item);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner11.setAdapter(adapter11);

    }
}