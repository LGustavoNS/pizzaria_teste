package com.the_spartan_of_war.pizzariaxds.helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.the_spartan_of_war.pizzariaxds.R;
import com.the_spartan_of_war.pizzariaxds.model.Pizzas;

import java.util.List;

public class PizzasAdapter extends RecyclerView.Adapter<PizzasAdapter.MyViewHolder> {

    private List<Pizzas> pizzas;

    public PizzasAdapter(List<Pizzas> listPizzas) {
        this.pizzas = listPizzas;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_escolha_seu_sabor, parent, false);

        return new MyViewHolder(itemList);

    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Pizzas pizza = pizzas.get(position);
        holder.txtPizzaPeperoni.setText(pizza.getPizza());
        holder.txt_a_patir_de.setText(pizza.getPizzas());
        holder.txtRDinheiro.setText(pizza.getDinheiro());
        holder.imgPeperoni.setImageResource(pizza.getImage());
    }

    @Override
    public int getItemCount() {
        return pizzas.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txtPizzaPeperoni;
        private TextView txt_a_patir_de;
        private TextView txtRDinheiro;
        private ImageView imgPeperoni;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtPizzaPeperoni = itemView.findViewById(R.id.txtPizzaPeperoni);
            txt_a_patir_de = itemView.findViewById(R.id.txt_a_patir_de);
            txtRDinheiro = itemView.findViewById(R.id.txtRDinheiro);
            imgPeperoni = itemView.findViewById(R.id.imgPeperoni);
        }
    }

}
