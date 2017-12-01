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

}
