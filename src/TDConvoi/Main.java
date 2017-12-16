package TDConvoi;

import TDConvoi.Exceptions.ConvoiVideException;
import TDConvoi.Exceptions.SurchargeException;
import TDConvoi.Exceptions.VehiculeDejaPresent;

public class Main
{
    public static void main(String [] args) throws SurchargeException, ConvoiVideException, VehiculeDejaPresent {
        Convoi convoi = new Convoi();
        System.out.println("test");
        CamionBache c = new CamionBache();
        c.setCharge(4500);
        CamionCiterne cc = new CamionCiterne();
        cc.setCharge(0);
        try {
            convoi.addVehicule(c);
            convoi.addVehicule(cc);
        } catch (VehiculeDejaPresent vehiculeDejaPresent) {
            vehiculeDejaPresent.printStackTrace();
        }
        System.out.println(convoi.getChargeMax());
    }

}