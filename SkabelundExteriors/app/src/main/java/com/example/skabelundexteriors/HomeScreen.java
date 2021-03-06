package com.example.skabelundexteriors;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeScreen extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        NavController controller = NavHostFragment.findNavController(this);

        View view = inflater.inflate(R.layout.fragment_home_screen, container, false);

        view.findViewById(R.id.home_screen_button).setOnClickListener(button -> {
            controller.navigate(R.id.action_homeScreen_to_shingleColors);
        });


        return view;
    }
}