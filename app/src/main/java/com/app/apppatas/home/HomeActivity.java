package com.app.apppatas.home;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import com.app.apppatas.R;
import com.app.apppatas.encontrar.TeEncontreFragment;
import com.app.apppatas.localizado.LocalizadoFragment;
import com.app.apppatas.perfil.mascota.PerfilMascotaFragment;
import com.app.apppatas.perfil.usuario.PerfilUsuarioFragment;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //loading the default fragment
        loadFragment(new HomeFragment());

        findElements();
        events();
    }

    private void findElements() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

    }

    private void events() {
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;

        switch (menuItem.getItemId()){
            case R.id.menu_inicio:
                Toast.makeText(HomeActivity.this, "Codigo de Home", Toast.LENGTH_SHORT).show();
                fragment = new HomeFragment();
                ((HomeFragment) fragment).getContext(getApplicationContext());
                break;
            case R.id.menu_localizado:
                Toast.makeText(HomeActivity.this, "Codigo de localizado", Toast.LENGTH_SHORT).show();
                fragment = new LocalizadoFragment();
                break;
            case R.id.menu_tencontre:
                Toast.makeText(HomeActivity.this, "Codigo de Te encontre", Toast.LENGTH_SHORT).show();
                fragment = new TeEncontreFragment();
                break;
            case R.id.menu_tu_mascota:
                Toast.makeText(HomeActivity.this, "Codigo de Tu Perfil Mascota", Toast.LENGTH_SHORT).show();
                fragment = new PerfilMascotaFragment();
                break;
            case R.id.menu_my_perfil:
                Toast.makeText(HomeActivity.this, "Codigo de My Perfil", Toast.LENGTH_SHORT).show();
                fragment = new PerfilUsuarioFragment();
                break;
        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
