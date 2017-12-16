package TDConvoi.Exceptions;

import java.util.UUID;

public class SurchargeException extends Exception {
    public SurchargeException(UUID immatriculation) {
        super("La charge dépasse la charge maximale du véhicule immatriculé : "+immatriculation);
    }
}
