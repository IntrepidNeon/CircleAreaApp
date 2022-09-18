package com.example.circleareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.circleareaapp.databinding.ActivityMainBinding;

import java.text.NumberFormat;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void doCalculation(View view) {
        try{
            float radius = Float.parseFloat(binding.radiusText.getText().toString());
            float area = (float)(radius * radius * Math.PI);
            binding.areaText.setText(String.format(Locale.ENGLISH,"%.2f",area));
        }
        catch (NumberFormatException e){

        }
    }
}