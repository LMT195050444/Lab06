package com.example.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class LinearVActivity extends AppCompatActivity {
    EditText myEditText;
    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_vactivity);
        myEditText = (EditText) findViewById(R.id.editTextName);
        myButton = (Button) findViewById(R.id.buttonSend);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("YourName",myEditText.getText().toString());
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
