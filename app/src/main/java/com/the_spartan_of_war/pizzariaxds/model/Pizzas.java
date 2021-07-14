package com.the_spartan_of_war.pizzariaxds.model;

public class Pizzas {

    private String pizza;
    private String pizzas;
    private String dinheiro;
    private int image;

    public Pizzas(){
    }

    public Pizzas(String pizza, String pizzas, String dinheiro, int image) {
        this.pizza = pizza;
        this.pizzas = pizzas;
        this.dinheiro = dinheiro;
        this.image = image;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getPizzas() {
        return pizzas;
    }

    public void setPizzas(String pizzas) {
        this.pizzas = pizzas;
    }

    public String getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(String dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}