package com.example.ownerandcarinfoapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ownerandcarinfoapp.R;


public class carInfoFrag extends Fragment {


    ImageView ivMake;
    TextView tvModel;
    View view;

    public carInfoFrag() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_car_info, container, false);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ivMake = view.findViewById(R.id.ivMake);
        tvModel = view.findViewById(R.id.tvModel);
    }

    public void setMake(String s)
    {
        if(s.equals("volkswagen"))
        {
            ivMake.setImageResource(R.drawable.volkswagen);

        }
        else if(s.equals("nissan"))
        {
            ivMake.setImageResource(R.drawable.nissan);

        }
        else
        {
            ivMake.setImageResource(R.drawable.mercedes);
        }

    }
    public void setModel(String s)
    {
        tvModel.setText(s);
    }
}