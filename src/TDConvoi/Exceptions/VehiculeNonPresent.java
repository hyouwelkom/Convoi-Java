package TDConvoi.Exceptions;

import java.util.UUID;

public class VehiculeNonPresent extends Exception {
    public VehiculeNonPresent(UUID immatriculation) {
        super("Le véhicule immatriculé : "+immatriculation+" n'est pas dans le convoi !");
    }
}
