package com.example.ownerandcarinfoapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ownerandcarinfoapp.R;


public class ownerInfoFrag extends Fragment {

    View view;
    TextView tvName, tvTel;

    public ownerInfoFrag() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view  = inflater.inflate(R.layout.fragment_owner_info, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvName = view.findViewById(R.id.tvName);
        tvTel = view.findViewById(R.id.tvTel);
    }

    public void setOwnerName(String s)
    {
        tvName.setText(s);
    }

    public void setTel(String s) {
        tvTel.setText(s);
    }

}