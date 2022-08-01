package com.example.tablayoutslide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tablayoutslide.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
   private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        for (int i = 0; i < 10; i++) {
            binding.tabRoot.addTab(binding.tabRoot.newTab().setText("Tab "+i));
        }

    }
}