package immobilier;
@SuppressWarnings("package")

public class ImoBatir extends BienImobilier {
    
    boolean viable;
    int Cout_Viabilisation;

    public ImoBatir(String description, int prix_au_m2, int surface, double taux_imposition, boolean estLouable, boolean estVendable, Propriétaire Propriétaire, Locataire Locataire, boolean viable, int Cout_Viabilisation) {
        super(description, prix_au_m2, surface, taux_imposition, estLouable, estVendable, Propriétaire, Locataire);
        this.viable = viable;
        this.Cout_Viabilisation = Cout_Viabilisation;
    }

    public boolean getViable() {
        return viable;
    }
    public void setViable(boolean viable) {
        this.viable = viable;
    }
    public int getCout_Viabilisation() {
        return Cout_Viabilisation;
    }

    public void setCout_Viabilisation(int Cout_Viabilisation) {
        this.Cout_Viabilisation = Cout_Viabilisation;
    }
}
