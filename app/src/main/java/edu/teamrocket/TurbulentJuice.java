package edu.teamrocket;

public class TurbulentJuice extends Bebida {
    
    private final String NOMBRE;
    private final Float PVP;

    public TurbulentJuice() {
        this.NOMBRE = "Turbulent Juice";
        this.PVP = 2.5f;
    }

    public String nombre() {
        return this.NOMBRE;
    }
    public Float pvp() {
        return this.PVP;
    }
}
