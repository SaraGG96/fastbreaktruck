package edu.teamrocket;

public class Eyeholes extends Cereales {
    
    private final String NOMBRE;
    private final Float PVP;

    public Eyeholes() {
        this.NOMBRE = "Eyeholes";
        this.PVP = 2.5f;
    }

    public String nombre() {
        return this.NOMBRE;
    }
    public Float pvp() {
        return this.PVP;
    }
    
}
