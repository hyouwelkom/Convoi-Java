import java.util.ArrayList;

public class Convoi {

    private Convoi instance;

    private final static int VITESSE_MAXI = 150;

    private ArrayList<Vehicule> listeVehicules;
    private int vitesseMax;
    private int chargeMax;

    public Convoi() {
        listeVehicules = new ArrayList<>();
    }

    public void addVehicule(Vehicule vehicule) {
        if(listeVehicules.contains(vehicule)) {
            System.out.println("Ce vehicule est déjà dans le convoi !");
        } else {
            listeVehicules.add(vehicule);
        }
    }

    public void removeVehicule (Vehicule vehicule) {
        if(listeVehicules.contains(vehicule)) {
            listeVehicules.remove(vehicule);
        } else {
            System.out.println("Ce vehicule n'est pas dans le convoi !");
        }
    }

    public int getVitesseMax() {
        if(!listeVehicules.isEmpty()) {
            int plusBasseVitesse = VITESSE_MAXI;
            for(int i = 0; i<listeVehicules.size(); i++) {
                int vitesseActuelle = listeVehicules.get(i).getVitesseMax();
                if(vitesseActuelle < plusBasseVitesse) {
                    plusBasseVitesse = vitesseActuelle;
                }
            }
            return plusBasseVitesse;
        } else return 0;

    }

}
