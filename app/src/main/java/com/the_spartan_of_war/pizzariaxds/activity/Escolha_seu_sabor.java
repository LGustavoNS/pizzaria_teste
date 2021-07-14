package com.the_spartan_of_war.pizzariaxds.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.the_spartan_of_war.pizzariaxds.R;

public class Escolha_seu_sabor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_seu_sabor);
    }

    public void detalhes_da_escolha (View view) {
        Intent i = new Intent( Escolha_seu_sabor.this, DetalhesEscolha.class);
        startActivity( i );
    }
}