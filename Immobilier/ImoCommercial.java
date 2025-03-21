package immobilier;

public class ImoCommercial extends BienImobilier {
    
    String Usage;

    public ImoCommercial(String description, int prix_au_m2, int surface, double taux_imposition, boolean estLouable, boolean estVendable, Propriétaire Propriétaire, Locataire Locataire, String Usage) {
        super(description, prix_au_m2, surface, taux_imposition, estLouable, estVendable, Propriétaire, Locataire);
        this.Usage = Usage;
    }

    public String getUsage() {
        return Usage;
    }
    public String setUsage(String Usage) {
        return this.Usage = Usage;
    }
}
