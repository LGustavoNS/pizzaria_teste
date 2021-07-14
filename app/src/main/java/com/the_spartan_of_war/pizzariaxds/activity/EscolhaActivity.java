package com.the_spartan_of_war.pizzariaxds.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.the_spartan_of_war.pizzariaxds.R;
import com.the_spartan_of_war.pizzariaxds.helper.PizzasAdapter;
import com.the_spartan_of_war.pizzariaxds.model.Pizzas;

import java.util.ArrayList;
import java.util.List;

public class EscolhaActivity extends AppCompatActivity {

    private RecyclerView RecyclerPizzas;
    private List<Pizzas> pizzas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        RecyclerPizzas = findViewById(R.id.RecyclerPizzas);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerPizzas.setLayoutManager(layoutManager);

        //define adapter
        this.preparePizzas();
        PizzasAdapter adpater = new PizzasAdapter(pizzas);
        RecyclerPizzas.setAdapter(adpater);

    }

    public void preparePizzas() {

        Pizzas p = new Pizzas("Pizza de Peperoni", "a partir de:", "R$ 29,99", R.drawable.pizza_peperoni);
        this.pizzas.add(p);

        p = new Pizzas("Pizza de Peperoni", "a partir de:", "R$ 29,99", R.drawable.pizza_peperoni);
        this.pizzas.add(p);

        p = new Pizzas("Pizza de Peperoni", "a partir de:", "R$ 29,99", R.drawable.pizza_peperoni);
        this.pizzas.add(p);

        p = new Pizzas("Pizza de Peperoni", "a partir de:", "R$ 29,99", R.drawable.pizza_peperoni);
        this.pizzas.add(p);

        p = new Pizzas("Pizza de Peperoni", "a partir de:", "R$ 29,99", R.drawable.pizza_peperoni);
        this.pizzas.add(p);

        p = new Pizzas("Pizza de Peperoni", "a partir de:", "R$ 29,99", R.drawable.pizza_peperoni);
        this.pizzas.add(p);
    }

    public void detalhes_da_escolha (View view) {
        Intent i = new Intent( EscolhaActivity.this, DetalhesEscolha.class);
        startActivity( i );
    }
}