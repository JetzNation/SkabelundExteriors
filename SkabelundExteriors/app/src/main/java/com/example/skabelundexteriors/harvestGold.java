package com.example.skabelundexteriors;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class harvestGold extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        NavController navController = NavHostFragment.findNavController(this);

        View view = inflater.inflate(R.layout.fragment_harvest_gold, container, false);
        view.findViewById(R.id.back_button_3).setOnClickListener(button -> {
            navController.navigate(R.id.action_harvestGold_to_shingleColors);
        });
        return view;
    }
}