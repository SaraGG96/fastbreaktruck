package edu.teamrocket;

public abstract class Cereales implements Item {
    
    public Cereales() {};

    @Override
    public Packing empaquetado() {
        return new Caja();
    };

    @Override
    public String toString() {
        return "Son cereales";
    }

}
