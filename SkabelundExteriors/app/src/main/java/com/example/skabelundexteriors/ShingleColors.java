package com.example.skabelundexteriors;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ShingleColors extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        NavController navController = NavHostFragment.findNavController(this);

        View view = inflater.inflate(R.layout.fragment_shingle_colors, container, false);

        view.findViewById(R.id.black_walnut).setOnClickListener(button -> {
            navController.navigate(R.id.action_shingleColors_to_blackWalnut);
        });
        view.findViewById(R.id.forest_green).setOnClickListener(button -> {
            navController.navigate(R.id.action_shingleColors_to_forestGreen);
        });

        return view;
    }
}