package com.example.lab1god;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name_et = findViewById(R.id.name_et);
        TextView greeting_text = findViewById(R.id.greeting_text);

        Button button = findViewById(R.id.greet_button);
        button.setOnClickListener(v -> {
            String name = name_et.getText().toString();
            String message = getString(R.string.greeting_message, name);
            greeting_text.setText(message);
        });
    }
}