package com.example.layoutbotonesdef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);
    }

    public void goLayoutBotons (View view){
        Intent intent = new Intent (this, LayoutBotons.class);
        startActivity(intent);
    }
}