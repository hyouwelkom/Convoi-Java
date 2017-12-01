public class CamionBache extends Vehicule {

    public CamionBache() {
        super(4000, 20000, 130);
        this.vitesseMax = calcVitesseMax();
    }

    public int calcVitesseMax() {

        if(this.charge == 0) {
            return 130;
        } else

        if(this.charge <= 3000) {
            return 110;
        } else

        if(3000 < this.charge && this.charge <= 7000) {
            return 90;
        } else return 80;

    }

    @Override
    public int getVitesseMax() {
        return this.calcVitesseMax();
    }

}
