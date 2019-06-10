package com.app.apppatas.home;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.apppatas.R;
import com.app.apppatas.publicar.adaptadores.PublicacionAdaptador;
import com.app.apppatas.publicar.modelo.Publicacion;

import java.util.List;

public class HomeFragment extends Fragment {

    private Context context;
    private RecyclerView recyclerView;
    private PublicacionAdaptador publicacionAdaptador;
    private List<Publicacion> listPublish;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        listPublish.add(new Publicacion("img","user","22/06/19","10:45"
                ,"Firulais","husky-siberiano","cafe-oscuro","mediano"
                ,"collar en forma de hueso","av. eeuu","manchas rojas","ninguna"));
        //recyclerView = context.fin(R.id.rv_publicaciones);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        publicacionAdaptador = new PublicacionAdaptador(getContext(),listPublish);
        recyclerView.setAdapter(publicacionAdaptador);
        return inflater.inflate(R.layout.fragment_home,null);
    }

    public Context getContext(Context context){
        return this.context = context;
    }
}
