package com.example.ownerandcarinfoapp.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ownerandcarinfoapp.ApplicationClass;
import com.example.ownerandcarinfoapp.R;
import com.example.ownerandcarinfoapp.carAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFrag extends Fragment {

    TextView tvName, tvTel;
    RecyclerView list;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    View view;




    public ListFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        list = view.findViewById(R.id.list);
        list.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this.getActivity());
        list.setLayoutManager(layoutManager);

        myAdapter = new carAdapter(this.getActivity(), ApplicationClass.cars);
        list.setAdapter(myAdapter);

    }
}