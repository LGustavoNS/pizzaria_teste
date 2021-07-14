package com.the_spartan_of_war.pizzariaxds.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.the_spartan_of_war.pizzariaxds.R;

public class Sucesso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso);
    }

    public void voltar_login (View view) {
        Intent i = new Intent( Sucesso.this, MainActivity.class);
        startActivity( i );
    }
}