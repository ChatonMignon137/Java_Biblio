package Biblio;

public class MembreBibliothèque{
    @SuppressWarnings("FieldMayBeFinal")
    private int NuméroAbonnée;
    private String Nom;
    private String Prénom;
    private String NuméroTéléphone;
    private String Adresse;
    private int nbEmprunt = 0;
    private static int compteur = 1;

    public MembreBibliothèque(String Nom, String Prénom, String NuméroTéléphone, String Adresse){
        this.Adresse = Adresse;
        this.Nom = Nom;
        this.Prénom = Prénom;
        this.NuméroTéléphone = NuméroTéléphone;
        this.NuméroAbonnée = ++compteur; 
    }
    //getters
    public int getNuméroAbonnée() {
        return NuméroAbonnée;
    }
    public String getNom(){
        return Nom;
    }
    public String getPrénom(){
        return Prénom;
    }
    public String getAdresse(){
        return Adresse;
    }
    public String getNuméroTéléphone(){
        return NuméroTéléphone;
    }
    public int getNbEmprunt(){
        return nbEmprunt;
    }
    //setters
    public void setNom(String Nom){
        this.Nom = Nom;
    }
    public void setPrénom(String Prénom){
        this.Prénom = Prénom;
    }
    public void setNuméroTéléphone(String NuméroTéléphone){
        this.NuméroTéléphone = NuméroTéléphone;
    }
    public void setAdresse(String Adresse){
        this.Adresse = Adresse;
    }
    @SuppressWarnings("override")
    public String toString(){
        return "Membre n°" + NuméroAbonnée + " : " + Prénom + " " + Nom + " habite au " + Adresse + " et son numéro de téléphone est le " + NuméroTéléphone;
    }
    public void incrementerNbEmprunt(){
        nbEmprunt++;
    }
    public void decrementerNbEmprunt(){
        nbEmprunt--;
    }
    public boolean peutemprunter(){
        return true;
    }
}