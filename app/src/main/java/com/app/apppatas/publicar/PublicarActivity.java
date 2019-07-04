package com.app.apppatas.publicar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.app.apppatas.R;

public class PublicarActivity extends AppCompatActivity {
    public CheckBox chk_recompensa;
    public EditText txt_monto_recompe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicar);
        chk_recompensa=findViewById(R.id.chk_recompensa);
        txt_monto_recompe=findViewById(R.id.txt_recompensa);
        if ( chk_recompensa.isChecked ()) {
            chk_recompensa.setChecked(false);
            txt_monto_recompe.setVisibility(View.VISIBLE);
        }else {
            txt_monto_recompe.setVisibility(View.GONE);
        }




    }


}
