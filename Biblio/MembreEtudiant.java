package Biblio;

public class MembreEtudiant extends MembreBibliothèque { 
    public MembreEtudiant(String Nom, String Prénom, String NuméroTéléphone, String Adresse) {
        super(Nom, Prénom, NuméroTéléphone, Adresse);
    }
    @Override
    public String toString() {
        return super.toString() + " MembreEtudiant";
    }
    @Override
    public boolean peutemprunter() {
        return getNbEmprunt() < 4;
    }
}
