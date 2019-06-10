package com.app.apppatas.home;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.apppatas.R;
import com.app.apppatas.publicar.PublicarFragment;
import com.app.apppatas.publicar.adaptadores.PublicacionAdaptador;
import com.app.apppatas.publicar.modelo.Publicacion;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private PublicacionAdaptador publicacionAdaptador;
    private List<Publicacion> listPublish = new ArrayList<>();
    private FloatingActionButton floatingActionButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vistafragment = inflater.inflate(R.layout.fragment_home,null);

        recyclerView = vistafragment.findViewById(R.id.rv_publicaciones);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarListaBaseDatos();
        publicacionAdaptador = new PublicacionAdaptador(getContext(),listPublish);
        recyclerView.setAdapter(publicacionAdaptador);

        floatingActionButton = vistafragment.findViewById(R.id.floatingActionButtonPublicar);

        events();

        return vistafragment;
    }

    private void events(){
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               switch (view.getId()){
                   case R.id.floatingActionButtonPublicar:
                       showPopupPublicar();
                       break;
               }
            }
        });
    }

    private void showPopupPublicar(){
        FragmentManager fragmentManager = getFragmentManager();
        PublicarFragment publicarFragment = new PublicarFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.add(R.id.fragment_container,publicarFragment).addToBackStack(null).commit();
    }

    private void llenarListaBaseDatos(){
        listPublish.add(new Publicacion("img","user1","22/06/19","10:45"
                ,"Firulais","husky-siberiano","cafe-oscuro","mediano"
                ,"collar en forma de hueso","av. eeuu","manchas rojas","ninguna"));

        listPublish.add(new Publicacion("img","user2","22/06/19","10:45"
                ,"Firulais","husky-siberiano","cafe-oscuro","mediano"
                ,"collar en forma de hueso","av. eeuu","manchas rojas","ninguna"));
        listPublish.add(new Publicacion("img","user3","22/06/19","10:45"
                ,"Firulais","husky-siberiano","cafe-oscuro","mediano"
                ,"collar en forma de hueso","av. eeuu","manchas rojas","ninguna"));
    }
}
