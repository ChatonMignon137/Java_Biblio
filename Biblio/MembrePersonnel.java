package Biblio;

public class MembrePersonnel extends MembreBibliothèque {
    
    public MembrePersonnel(String Nom, String Prénom, String NuméroTéléphone, String Adresse) {
        super(Nom, Prénom, NuméroTéléphone, Adresse);
    }
    @Override
    public String toString() {
        return super.toString() + " MembrePersonnel";
    }
    @Override
    public boolean peutemprunter() {
        return getNbEmprunt() < 8;
    }
}
