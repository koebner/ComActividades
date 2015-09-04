package com.androiddev.koebner.comactividades;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class HermanitoActividad2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hermanito_actividad2);
        String mensajito = getIntent().getStringExtra("Mandamensaje");
        Log.d("Hola a todos soy una segunda actividad", mensajito);
    }

}
