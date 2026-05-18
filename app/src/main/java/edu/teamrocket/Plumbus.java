package edu.teamrocket;

public class Plumbus extends Juguetes {
    
    private final String NOMBRE;
    private final Float PVP;

    public Plumbus() {
        this.NOMBRE = "Plumbus";
        this.PVP = 0.0f;
    }

    public String nombre() {
        return this.NOMBRE;
    }
    public Float pvp() {
        return this.PVP;
    }
    
}
