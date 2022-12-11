package com.example.layoutbotonesdef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RelativeLayout extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    }

    public void goTableLayout (View view){
        Intent intent = new Intent (this, TableLayout.class);
        startActivity(intent);
    }

    public void goQualsevolLayout (View view){
        Intent intent = new Intent (this, QualsevolLayout.class);
        startActivity(intent);
    }

    public void goMoreButtons (View view){
        Intent intent = new Intent (this, MoreButtons.class);
        startActivity(intent);
    }

    public void goLayoutBotons (View view){
        Intent intent = new Intent (this, LayoutBotons.class);
        startActivity(intent);
    }
}