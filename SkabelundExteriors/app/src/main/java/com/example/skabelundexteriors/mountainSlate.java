package com.example.skabelundexteriors;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class mountainSlate extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        NavController navController = NavHostFragment.findNavController(this);

        View view = inflater.inflate(R.layout.fragment_mountain_slate, container, false);
        view.findViewById(R.id.back_button_4).setOnClickListener(button -> {
            navController.navigate(R.id.action_mountainSlate_to_shingleColors);
        });
        return view;
    }
}