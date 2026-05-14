package edu.teamrocket;

public class FleebJuice extends Bebida {

    private final String NOMBRE;
    private final Float PVP;

    public FleebJuice() {
        this.NOMBRE = "Fleeb Juice";
        this.PVP = 3.5f;
    }

    public String nombre() {
        return this.NOMBRE;
    }
    public Float pvp() {
        return this.PVP;
    }
    
    @Override
    public String toString() {
        return this.nombre() + this.pvp() + this.empaquetado().envoltorio();
    }

}
