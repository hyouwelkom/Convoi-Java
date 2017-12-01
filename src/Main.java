import Exceptions.ConvoiVideException;
import Exceptions.SurchargeException;

public class Main
{
    public static void main(String [] args) throws SurchargeException, ConvoiVideException {
        Convoi convoi = new Convoi();
        System.out.println("test");
        CamionBache c = new CamionBache();
        c.setCharge(4500);
        CamionCiterne cc = new CamionCiterne();
        cc.setCharge(0);
        System.out.println(convoi.getVitesseMax());
    }

}