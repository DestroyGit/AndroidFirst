package com.example.lesson1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // подключение макета в активити
        String s = getResources().getString(R.string.hello); // получение текста из макета
        TextView helloW = findViewById(R.id.helloW); // для нахождения элемента в макете
        helloW.setText(R.string.hello);

        // Добавляем 2 восклицательных знака к нашему тексту, который выводится на экран
        String hello = getResources().getString(R.string.hello);
        hello += "!!";
        hello += "пам-пам";
        helloW.setText(hello);
    }
}