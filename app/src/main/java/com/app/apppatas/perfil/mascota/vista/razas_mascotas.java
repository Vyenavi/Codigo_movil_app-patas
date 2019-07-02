package com.app.apppatas.perfil.mascota.vista;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.apppatas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class razas_mascotas extends Fragment {


    public razas_mascotas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_razas_mascotas, container, false);
    }

}
