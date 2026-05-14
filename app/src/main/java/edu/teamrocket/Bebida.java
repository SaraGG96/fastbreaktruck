package edu.teamrocket;

public abstract class Bebida implements Item {
    
    public Bebida() {};

    @Override
    public Packing empaquetado() {
        return new Tubo();
    };

    @Override
    public String toString() {
        return "Es una bebida";
    }
 

}
