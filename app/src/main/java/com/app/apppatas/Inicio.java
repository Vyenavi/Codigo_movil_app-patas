package com.app.apppatas;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.app.apppatas.home.HomeActivity;

public class Inicio extends AppCompatActivity {

    private EditText user, pass;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        findElements();
        events();
    }

    private void findElements() {
        user = findViewById(R.id.edtxtUser);
        pass = findViewById(R.id.edtxtPass);
        btnlogin = findViewById(R.id.btnLogin);

    }
    private void events() {

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);
            }
        });
    }
}
