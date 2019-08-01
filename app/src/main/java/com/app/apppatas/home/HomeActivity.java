package com.app.apppatas.home;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.app.apppatas.R;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findElements();
        events();
    }

    private void findElements() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

    }

    private void events() {

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.menu_inicio:
                        Toast.makeText(HomeActivity.this, "Codigo de Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_localizado:
                        Toast.makeText(HomeActivity.this, "Codigo de localizado", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_tencontre:
                        Toast.makeText(HomeActivity.this, "Codigo de Te encontre", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_tu_mascota:
                        Toast.makeText(HomeActivity.this, "Codigo de Tu Perfil Mascota", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_my_perfil:
                        Toast.makeText(HomeActivity.this, "Codigo de My Perfil", Toast.LENGTH_SHORT).show();
                        break;
                }

                return false;
            }
        });
    }
}
