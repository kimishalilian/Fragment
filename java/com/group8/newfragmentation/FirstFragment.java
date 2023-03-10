package com.group8.newfragmentation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FirstFragment extends Fragment {


    View view;
    Button firstButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_first, container, false);
// get the reference of Button
        firstButton = view.findViewById(R.id.firstButton);
// perform setOnClickListener on first Button
        firstButton.setOnClickListener( v -> {
// display a message by using a Toast
            Toast.makeText(getActivity(), "First Fragment", Toast.LENGTH_LONG).show();
        } );
        return view;
    }
}