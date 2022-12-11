package com.example.layoutbotonesdef;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class LayoutBotons extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    ToggleButton tgbot;
    ImageView imagen1;
    private View imagen2;
    private Switch btnswitch;
    private ConstraintLayout cLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_botons);

        tgbot=(ToggleButton) findViewById(R.id.tgboton);
        tgbot.setOnCheckedChangeListener(this);

        imagen1=(ImageView) findViewById(R.id.imageView);
        imagen2=findViewById(R.id.imageView2);
        imagen2.setVisibility(View.GONE);

        btnswitch = findViewById(R.id.switch1);
        cLayout = findViewById(R.id.linearl);

    }

    public void goFrameLayout (View view){
        Intent intent = new Intent (this, FrameLayout.class);
        startActivity(intent);
    }

    public void goMoreButtons (View view){
        Intent intent = new Intent (this, MoreButtons.class);
        startActivity(intent);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if(isChecked){
            imagen1.setVisibility(compoundButton.VISIBLE);
            imagen2.setVisibility(compoundButton.INVISIBLE);
        } else{
            imagen1.setVisibility(compoundButton.INVISIBLE);
            imagen2.setVisibility(compoundButton.VISIBLE);
        }
    }

    public void cambiarColor(View view) {
        if(btnswitch.isChecked()){
            setTheme(R.style.Theme_LayoutBotonesDef);
            cLayout.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorBackGround));
            Toast.makeText(this, "ON", Toast.LENGTH_SHORT).show();
        } else {
            setTheme(R.style.Theme_LayoutBotonesDef2);
            cLayout.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorBackGround2));
            Toast.makeText(this, "OFF", Toast.LENGTH_SHORT).show();
        }
    }
}