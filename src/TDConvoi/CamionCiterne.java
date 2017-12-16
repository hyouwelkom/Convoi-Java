package TDConvoi;

public class CamionCiterne extends Vehicule {

    public CamionCiterne() {
        super(3000, 10000, VITESSE_MAX);
        this.vitesseMax = calcVitesseMax();
    }

    public int calcVitesseMax() {

        if(this.charge == 0) {
            return 130;
        } else

        if(this.charge <= 1000) {
            return 110;
        } else

        if(1000 < this.charge && this.charge <= 4000) {
            return 90;
        } else return 80;

    }

    @Override
    public int getVitesseMax() {
        return this.calcVitesseMax();
    }
}
