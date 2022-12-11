package com.example.layoutbotonesdef;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
    }

    public void goGridLayout (View view){
        Intent intent = new Intent (this, GridLayout.class);
        startActivity(intent);
    }

    public void goLayoutBotons (View view){
        Intent intent = new Intent (this, LayoutBotons.class);
        startActivity(intent);
    }

    public void goFormulario (View view){
        Intent intent = new Intent (this, Formulario.class);
        startActivity(intent);
    }

    public void goOhMyGod (View view){
        Intent intent = new Intent (this, OhMyGod.class);
        startActivity(intent);
    }

}