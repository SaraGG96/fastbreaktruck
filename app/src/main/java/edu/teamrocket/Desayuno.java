package edu.teamrocket;
import java.util.ArrayList;
import java.util.List;

public class Desayuno {
    
    private Float total;
    private List<Item> items = new ArrayList<>();

    public Desayuno() {
        this.total = 0.0f;
    }

    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.pvp();
    }

    public List<Item> getItems() {
        return this.items;
    }


    public void mostrarItems() {
        for (Item item : this.items) {
            System.out.println(item.nombre() + " - " + item.pvp());
        }
    }

    public Float getCoste() {
        return this.total;
    }




}
