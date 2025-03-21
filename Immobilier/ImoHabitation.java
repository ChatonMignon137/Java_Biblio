package immobilier;

public class ImoHabitation extends BienImobilier {
    
    int PrixAchat;

    public ImoHabitation(String description, int prix_au_m2, int surface, double taux_imposition, boolean estLouable, boolean estVendable, Propriétaire Propriétaire, Locataire Locataire, int PrixAchat) {
        super(description, prix_au_m2, surface, taux_imposition, estLouable, estVendable, Propriétaire, Locataire);
        this.PrixAchat = PrixAchat;
    }

    public int getPrixAchat() {
        return PrixAchat;
    }
    public int setPrixAchat(int PrixAchat) {
        return this.PrixAchat = PrixAchat;
    }

    @Override
    public String toString(){
        return "ImoHabitation : " + getDescription() + " de " + getSurface() + "m², prix au m² de " + getPrixAuM2() + "€, taux d'imposition de " + getTauxImposition() + ", est louable : " + getEstLouable() + ", est vendable : " + getEstvendable() + ", appartient à " + getPropriétaire().getIdentitée() + ", occupé par " + getLocataire().getIdentitée() + ", prix d'achat : " + getPrixAchat() + "€";
    }
}
