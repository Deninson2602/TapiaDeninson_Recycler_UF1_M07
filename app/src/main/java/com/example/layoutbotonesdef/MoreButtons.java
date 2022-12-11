package com.example.layoutbotonesdef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MoreButtons extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_buttons);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.textView);

        Button buttonApply = findViewById(R.id.btnsubmit);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                textView.setText("Su elección: " + radioButton.getText());

            }
        });

    }

    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        Toast.makeText(this, "Opción escogida: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

    public void goFrameLayout (View view){
        Intent intent = new Intent (this, FrameLayout.class);
        startActivity(intent);
    }

}