package com.example.lab2_layout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    // Метод, который вызывается, когда приложение создает и отображает Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //  вызов метода родительского класса
        setContentView(R.layout.activity_main); // устанавливаем содержимое Activity из layout-файла
    }
}