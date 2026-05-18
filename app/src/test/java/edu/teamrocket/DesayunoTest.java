package edu.teamrocket;
import org.junit.Test;

public class DesayunoTest {
    
    @Test
    public void testDesayuno() {
        Desayuno eyeDes = FastBreakTruck.prepararEyeHoles();
        assert eyeDes.getCoste() == 5.0;

        Desayuno smigDes = FastBreakTruck.prepararSmiggles();
        assert smigDes.getCoste() == 5.0;

        FastBreakTruck.incluirJuguete(eyeDes);
        assert eyeDes.getCoste() == 5.0;
    }
}
