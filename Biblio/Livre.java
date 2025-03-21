package Biblio;

public class Livre extends DocBiblio {
    
    int nbPages;
    String NomEditeur;
    String ISBN;

    public Livre(String code_archivage, String titre, String auteur, int annee_publication, int nbPages, String NomEditeur, String ISBN) {
        super(code_archivage, titre, auteur, annee_publication);
    }
    public int getNbPages(){
        return nbPages;
    }
    public String getNomEditeur(){
        return NomEditeur;
    }
    public String getISBN(){
        return ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + "Livre{" + "nbPages=" + nbPages + ", NomEditeur=" + NomEditeur + ", ISBN=" + ISBN + '}';
    }
}
