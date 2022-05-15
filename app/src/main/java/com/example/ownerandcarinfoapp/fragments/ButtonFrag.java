package com.example.ownerandcarinfoapp.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.ownerandcarinfoapp.MainActivity;
import com.example.ownerandcarinfoapp.R;


public class ButtonFrag extends Fragment {


    Button carInfo, ownersInfo;
    View view;
    int pos;


    public ButtonFrag() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_button, container, false);
        return view;

    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        carInfo = view.findViewById(R.id.carInfo);
        ownersInfo = view.findViewById(R.id.ownerInfo);

        carInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.setCarInfo();

            }
        });
        ownersInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.setOwnerInfo();

            }
        });

    }








}