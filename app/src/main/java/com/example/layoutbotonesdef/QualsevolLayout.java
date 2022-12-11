package com.example.layoutbotonesdef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QualsevolLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qualsevol_layout);
    }

    public void goRelativeLayout (View view){
        Intent intent = new Intent (this, RelativeLayout.class);
        startActivity(intent);
    }

    public void goLayoutBotons (View view){
        Intent intent = new Intent (this, LayoutBotons.class);
        startActivity(intent);
    }

    public void goMoreButtons (View view){
        Intent intent = new Intent (this, MoreButtons.class);
        startActivity(intent);
    }
}