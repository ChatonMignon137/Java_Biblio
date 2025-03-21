package immobilier;

@SuppressWarnings("package")

public class ImoRapport extends BienImobilier {
    
    int reduction_Impot;

    public ImoRapport(String description, int prix_au_m2, int surface, double taux_imposition, boolean estLouable, boolean estVendable, Propriétaire Propriétaire, Locataire Locataire, int reduction_Impot) {
        super(description, prix_au_m2, surface, taux_imposition, estLouable, estVendable, Propriétaire, Locataire);
        this.reduction_Impot = reduction_Impot;
    }

    public int getReduction_Impot() {
        return reduction_Impot;
    }
    public int setReduction_Impot(int reduction_Impot) {
        return this.reduction_Impot = reduction_Impot;
    }
}
