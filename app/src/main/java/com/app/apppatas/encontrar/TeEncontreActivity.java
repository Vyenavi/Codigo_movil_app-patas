package com.app.apppatas.encontrar;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.apppatas.R;
import com.app.apppatas.encontrar.adaptador.ViewPagerAdapter;
import com.app.apppatas.encontrar.by_cam.TeEncontreCamaraFragment;
import com.app.apppatas.encontrar.by_features.TeEncontreCaracteristicasFragment;

public class TeEncontreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_te_encontre);

    }
}
