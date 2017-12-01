import Exceptions.SurchargeException;

public class Main
{
    public static void main(String [] args) throws SurchargeException {
        Convoi convoi = new Convoi();
        System.out.println("test");
        CamionBache c = new CamionBache();
        c.setCharge(45000);
        CamionCiterne cc = new CamionCiterne();
        cc.setCharge(0);
        convoi.addVehicule(c);
        convoi.addVehicule(cc);
        System.out.println(convoi.getVitesseMax());
    }

}