package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final Animal[] animals = {
            new Animal(R.drawable.animal1, "Кіт", "Це дуже миле й пухнасте створіння."),
            new Animal(R.drawable.animal2, "Собака", "Вірний друг людини."),
            new Animal(R.drawable.animal3, "Ведмідь", "Міцний і сильний.")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> openSecondActivity(animals[0]));

        button2.setOnClickListener(v -> openSecondActivity(animals[1]));

        button3.setOnClickListener(v -> openSecondActivity(animals[2]));
    }

    private void openSecondActivity(Animal animal) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("animal", animal.toString());
        startActivity(intent);
    }
}
