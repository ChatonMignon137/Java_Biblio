package Biblio;

public class DocBiblio {
    int code_archivage;
    String titre;
    String auteur;
    int annee_publication;

    // Constructor

    public DocBiblio(int code_archivage, String titre, String auteur, int annee_publication) {
        this.code_archivage = code_archivage;
        this.titre = titre;
        this.auteur = auteur;
        this.annee_publication = annee_publication;
    }

    // Getters
    public int getCodeArchivage() {
        return code_archivage;
    }
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }
    public int getAnneePublication() {
        return annee_publication;
    }

    // Setters

    public void setCodeArchivage(int code_archivage) {
        this.code_archivage = code_archivage;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setAnneePublication(int annee_publication) {
        this.annee_publication = annee_publication;
    }
    
}