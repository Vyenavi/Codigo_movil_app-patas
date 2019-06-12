package com.app.apppatas.encontrar;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.apppatas.R;
import com.app.apppatas.encontrar.adaptador.ViewPagerAdapter;
import com.app.apppatas.encontrar.by_cam.TeEncontreCamaraFragment;
import com.app.apppatas.encontrar.by_features.TeEncontreCaracteristicasFragment;
import com.app.apppatas.encontrar.by_gallery.TeEncontreGalleryFragment;

public class TeEncontreFragment extends Fragment {

    private FragmentActivity myContextFragment;

    @Override
    public void onAttach(Context context) {
        myContextFragment =(FragmentActivity) context;
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentManager fragmentManager = myContextFragment.getSupportFragmentManager();
        View vistaGeneral = inflater.inflate(R.layout.fragment_te_encontre, null);

        ViewPager viewPager = vistaGeneral.findViewById(R.id.viewpagerTeEcontre);
        TabLayout tabLayout = vistaGeneral.findViewById(R.id.tabsTeEncontre);

        ViewPagerAdapter adapter = new ViewPagerAdapter(fragmentManager);
        adapter.addFragment(new TeEncontreCamaraFragment(), "Camara");
        adapter.addFragment(new TeEncontreGalleryFragment(), "Gallery");
        adapter.addFragment(new TeEncontreCaracteristicasFragment(), "Formulario");

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_media_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_media_gallery);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_media_features);

        return vistaGeneral;
    }
}
