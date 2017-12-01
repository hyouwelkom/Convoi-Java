package Exceptions;

import java.util.UUID;

public class VehiculeDejaPresent extends Exception {
    public VehiculeDejaPresent(UUID immatriculation) {
        super("Le véhicule immatriculé : "+immatriculation+" est déjà présent dans le convoi !");
    }
}
