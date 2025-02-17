package Immobilier;

public class BienImobilier {
    private static int bID = 0;
    private String description;
    private int prix_au_m2;
    private int surface;
    private double taux_imposition;
    private boolean estLouable;
    private boolean estVendable;
    private double taxe_fonciere;
    private Locataire Locataire;
    private Propriétaire Propriétaire;

    public BienImobilier(String description, int prix_au_m2, int surface, double taux_imposition, boolean estLouable, boolean estVendable, Propriétaire Propriétaire, Locataire Locataire) {
        this.description = description;
        this.prix_au_m2 = prix_au_m2;
        this.surface = surface;
        this.taux_imposition = taux_imposition;
        this.estLouable = estLouable;
        this.estVendable = estVendable;
        this.taxe_fonciere = 0;
        this.Locataire = Locataire;
        this.Propriétaire = Propriétaire;
        bID++;
    }
    
    public String getDescription() {
        return description;
    }

    public int getPrixAuM2() {
        return prix_au_m2;
    }

    public int getSurface() {
        return surface;
    }

    public int getbID(){
        return bID;
    }

    public Propriétaire getPropriétaire(){
        return Propriétaire;
    }

    public Locataire getLocataire(){
        return Locataire;
    }

    public double getTauxImposition(){
        return taux_imposition;
    }

    public boolean getEstvendable(){
        return estVendable;
    }

    public boolean getEstLouable(){
        return estLouable;
    }

    public double getTaxeFonciere(){
        return taxe_fonciere;
    }

    public String toString;

    public double calculateTaxeFonciere(){
        double resultat = 0;
        resultat = (prix_au_m2*surface)*12;
        resultat = resultat*0.5;
        resultat = resultat * taux_imposition;
        resultat = resultat*100;
        resultat = Math.round(resultat);
        resultat = resultat/100;
        return resultat;
    }

    public static int comparetaxe(double t1, double t2){
        int resultat = 12;
        if (t1 > t2) {
            resultat = 1;
        }
        if (t1 < t2){
            resultat = -1;
        }
        if (t1 == t2) {
            resultat = 0;
        }
        return resultat;
    }

    public void setTaxeFonciere(double taxe_donnee){
        if (taxe_donnee < 0){
            taxe_donnee = 0;
        }
        else{
            this.taxe_fonciere = taxe_donnee;
        }
    }

    public void setEstLouable(boolean value){
        this.estLouable = value;
    }

    public void setEstVendable(boolean value){
        this.estVendable = value;
    }
    public void setTauxImposition(double new_tax){
        if(new_tax < 0){
            this.taux_imposition = 0;
        }
        else{
            new_tax = new_tax/100;
            this.taux_imposition = new_tax;
        }
       
    }
    public void setSurface(int new_surface){
        if (new_surface < 9) {
            this.surface = 9;
        }
        else{
            this.surface = new_surface;
        }
    }
    public void setprixm2(int new_price){
        if (new_price < 0) {
            this.prix_au_m2 = 0;
        }
        else{
            this.prix_au_m2 = new_price;
        }
    }

    public void setdescription(String description_new){
        this.description = description_new;
    }

    public void setLocataire(Locataire Locataire){
        this.Locataire = Locataire;
    }
    public void setPropriétaire(Propriétaire Propriétaire){
        this.Propriétaire = Propriétaire;
    }
}






