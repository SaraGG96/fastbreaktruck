package edu.teamrocket;

public abstract class Juguetes implements Item {
    
    public Juguetes() {};

    @Override
    public Packing empaquetado() {
        return new Caja();
    };

    @Override
    public String toString() {
        return "Son juguetes de regalo";
    }

}
