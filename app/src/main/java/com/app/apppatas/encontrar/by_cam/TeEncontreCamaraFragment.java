package com.app.apppatas.encontrar.by_cam;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.app.apppatas.R;

public class TeEncontreCamaraFragment extends Fragment {
    private static final String TAG = "PhotoFragment: ";

    //constantes
    private static final int PHOTO_FRAGMENT_NUM = 1;
    private static final int GALLERY_FRAGMENT_NUM = 2;

    private ImageButton imageButton;

    public TeEncontreCamaraFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_te_encontre_camara, null);

        findElements(vista);
        events();

        return vista;
    }

    private void findElements(View v){
        imageButton = v.findViewById(R.id.ib_take_photo);
    }

    private void events(){
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onclick, launching in camera");
            }
        });
    }
}
