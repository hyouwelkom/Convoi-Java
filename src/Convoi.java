import Exceptions.ConvoiVideException;
import Exceptions.VehiculeDejaPresent;
import Exceptions.VehiculeNonPresent;

import java.util.ArrayList;

public class Convoi {

    private Convoi instance;


    private ArrayList<Vehicule> listeVehicules;
    private int vitesseMax;
    private int chargeMax;

    public Convoi() {
        listeVehicules = new ArrayList<>();
    }

    public void addVehicule(Vehicule vehicule) throws VehiculeDejaPresent {
        if(listeVehicules.contains(vehicule)) {
            throw new VehiculeDejaPresent(vehicule.getImmatriculation());
        } else {
            listeVehicules.add(vehicule);
        }
    }

    public void removeVehicule (Vehicule vehicule) throws VehiculeNonPresent {
        if(listeVehicules.contains(vehicule)) {
            listeVehicules.remove(vehicule);
        } else {
            throw new VehiculeNonPresent(vehicule.getImmatriculation());
        }
    }

    public int getVitesseMax() throws ConvoiVideException {
        if(!listeVehicules.isEmpty()) {
            int plusBasseVitesse = Integer.MAX_VALUE;
            for(int i = 0; i<listeVehicules.size(); i++) {
                int vitesseActuelle = listeVehicules.get(i).getVitesseMax();
                if(vitesseActuelle < plusBasseVitesse) {
                    plusBasseVitesse = vitesseActuelle;
                }
            }
            return plusBasseVitesse;
        } else {
            throw new ConvoiVideException();
        }

    }

    public int getChargeMax() throws ConvoiVideException {
        if(!listeVehicules.isEmpty()) {
            int chargesMaxTotales = 0;
            for(int i = 0; i<listeVehicules.size(); i++) {
                chargesMaxTotales += listeVehicules.get(i).charge;
            }
            return chargesMaxTotales;
        } else {
            throw new ConvoiVideException();
        }

    }

}
