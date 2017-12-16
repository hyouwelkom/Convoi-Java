package TDConvoi.Test;

import TDConvoi.CamionBache;
import TDConvoi.CamionCiterne;
import TDConvoi.Convoi;
import TDConvoi.PetitBus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvoiTest {

    private final Convoi convoi = new Convoi();

    private final CamionBache cb1 = new CamionBache();
    private final CamionBache cb2 = new CamionBache();

    private final CamionCiterne cc1 = new CamionCiterne();
    private final CamionCiterne cc2 = new CamionCiterne();

    private final PetitBus pb1 = new PetitBus();
    private final PetitBus pb2 = new PetitBus();



    @Before
    public void setUp() throws Exception {
        convoi.addVehicule(cc2);
    }

    @After
    public void tearDown() throws Exception {
        convoi.removeVehicule(cc2);
    }

    @Test
    public void getVitesseMax() throws Exception {
        assertEquals(130, convoi.getVitesseMax());
        cc1.setCharge(2000);
        convoi.addVehicule(cc1);
        assertEquals(90, convoi.getVitesseMax());
        convoi.removeVehicule(cc1);
        assertEquals(130, convoi.getVitesseMax());
    }

    @Test
    public void getChargeMax() throws Exception {
        convoi.addVehicule(cb1);
        convoi.addVehicule(cc1);
        convoi.addVehicule(pb2);
        assertEquals(40000, convoi.getChargeMax());
    }

}