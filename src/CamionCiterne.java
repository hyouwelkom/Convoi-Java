public class CamionCiterne extends Vehicule {

    private CamionCiterne() {
        super(3, 10, 0);
    }

    private int calcVitesseMax() {
        
        if(this.charge == 0) {
            return 130;
        }

        if(this.charge <= 1000) {
            return 110;
        }

        if(1000 < this.charge && this.charge <= 4000) {
            return 90;
        }

        if(this.charge > 4000) {
            return 80;
        }


    }

}
