import Exceptions.SurchargeException;

import java.util.UUID;

public abstract class Vehicule {

    private final int poidsAVide;
    private final UUID immatriculation;
    protected int charge;
    private final int chargeMax;
    protected int vitesseMax;


    public Vehicule(int poidsAVide, int chargeMax, int vitesseMax) {
        this.poidsAVide = poidsAVide;
        this.immatriculation = UUID.randomUUID();
        this.chargeMax = chargeMax;
        this.charge = 0;
        this.vitesseMax = vitesseMax;
    }

    public void setCharge(int charge) throws SurchargeException {
        if(this.isAllowed(charge)) {
            this.charge = charge;
        } else {
            throw new SurchargeException(this.immatriculation);
        }
    }

    public int getVitesseMax() {
        return this.vitesseMax;
    }

    private boolean isAllowed(int charge) {
        return charge < chargeMax;
    }

}
