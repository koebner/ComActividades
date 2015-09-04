package com.androiddev.koebner.comactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent ibm = new Intent(this, HermanitoActividad2.class);
        ibm.putExtra("Mandamensaje", "Hola");
        startActivity(ibm);

    }

}
