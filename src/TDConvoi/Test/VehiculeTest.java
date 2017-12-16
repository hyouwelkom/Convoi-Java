package TDConvoi.Test;

import TDConvoi.CamionCiterne;
import TDConvoi.Exceptions.SurchargeException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehiculeTest {

    private CamionCiterne c;

    @Before
    public void setUp() throws Exception {
        c = new CamionCiterne();
    }

    @Test(expected = SurchargeException.class)
    public void setCharge() throws Exception {
        c.setCharge(c.getChargeMax());
    }

    @Test
    public void getVitesseMax() throws Exception {
        assertEquals(130, c.getVitesseMax());
        c.setCharge(1000);
        assertEquals(110, c.getVitesseMax());
        c.setCharge(4000);
        assertEquals(90, c.getVitesseMax());
        c.setCharge(4001);
        assertEquals(80, c.getVitesseMax());
    }

    @Test
    public void getChargeMax() throws Exception {
        assertEquals(10000, c.getChargeMax());
    }

    @Test
    public void getHorsePower() throws Exception {
        assertEquals(100, c.getHorsePower());
    }

}