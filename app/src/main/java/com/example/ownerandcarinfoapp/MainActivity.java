package com.example.ownerandcarinfoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ownerandcarinfoapp.fragments.ButtonFrag;
import com.example.ownerandcarinfoapp.fragments.ListFrag;
import com.example.ownerandcarinfoapp.fragments.carInfoFrag;
import com.example.ownerandcarinfoapp.fragments.ownerInfoFrag;

public class MainActivity extends AppCompatActivity implements carAdapter.ItemClicked {

    FragmentManager fragmentManager;
    Fragment buttonFrag, listFrag;
    Button carInfo, ownerInfo;
    ButtonFrag btnFrag;
    ownerInfoFrag ownerInfoFrag;
    carInfoFrag carInfoFrag;


    //com.example.ownerandcarinfoapp.fragments.ownerInfoFrag ownerInfoFrag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carInfo = findViewById(R.id.carInfo);

        fragmentManager = getSupportFragmentManager();
        listFrag = fragmentManager.findFragmentById(R.id.listFrag);
        buttonFrag = fragmentManager.findFragmentById(R.id.btnFrag);
        //carInfoFrag = fragmentManager.findFragmentById(R.id.carInfoFrag);
        //ownerInfoFrag = fragmentManager.findFragmentById(R.id.ownerInfoFrag);

        carInfoFrag = (carInfoFrag) getSupportFragmentManager().findFragmentById(R.id.carInfoFrag);
        ownerInfoFrag = (ownerInfoFrag) getSupportFragmentManager().findFragmentById(R.id.ownerInfoFrag);
        fragmentManager.beginTransaction()
                .show(listFrag)
                .show(buttonFrag)
                .show(carInfoFrag)
                .hide(ownerInfoFrag)
                .commit();




    }
    public void setOwnerInfo()
    {
        fragmentManager.beginTransaction()
                .hide(carInfoFrag)
                .show(ownerInfoFrag)
                .commit();

    }
    public void setCarInfo()
    {
        fragmentManager.beginTransaction()
                .show(carInfoFrag)
                .hide(ownerInfoFrag)
                .commit();

    }


    @Override
    public void onItemClicked(int index) {


        //ownerInfoFrag = (ownerInfoFrag) getSupportFragmentManager().findFragmentById(R.id.ownerInfoFrag);
        ownerInfoFrag  = (ownerInfoFrag) getSupportFragmentManager().findFragmentById(R.id.ownerInfoFrag);
        ownerInfoFrag.setOwnerName(ApplicationClass.cars.get(index).getOwnerName());
        ownerInfoFrag.setTel(ApplicationClass.cars.get(index).getOwnerTel());

        carInfoFrag = (carInfoFrag) getSupportFragmentManager().findFragmentById(R.id.carInfoFrag);
        carInfoFrag.setMake(ApplicationClass.cars.get(index).getMake());
        carInfoFrag.setModel(ApplicationClass.cars.get(index).getModel());




    }
}