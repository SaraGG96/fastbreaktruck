package edu.teamrocket;

public class Smiggles extends Cereales {
    
    private final String NOMBRE;
    private final Float PVP;

    public Smiggles() {
        this.NOMBRE = "Smiggles";
        this.PVP = 2.5f;
    }

    public String nombre() {
        return this.NOMBRE;
    }
    public Float pvp() {
        return this.PVP;
    }

}
