package Biblio;



public class DocBiblio {
    String code_archivage;
    String titre;
    String auteur;
    int annee_publication;
    String StatutDoc;

    // Constructor

    public DocBiblio(String code_archivage, String titre, String auteur, int annee_publication ) {
        this.code_archivage = code_archivage;
        this.titre = titre;
        this.auteur = auteur;
        this.annee_publication = annee_publication;
        this.StatutDoc = "étagère";
    }

    // Getters
    public String getCodeArchivage() {
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
    public String getDocStatut(){
        return StatutDoc;
    }

    // Setters

    public void setCodeArchivage(String code_archivage) {
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
    public void SetStatut(String Statut){
        this.StatutDoc = Statut;
    }
    
    //Methodes cycle de vie 

    public boolean emprunt(){
        if(getDocStatut() ==  "étagère")
        {
            SetStatut("emprunté");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean reservation(){
        if(getDocStatut() == "emprunté"){
            SetStatut("réservée");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean retour_docu(){
        if (getDocStatut() == "réservée") {
            SetStatut("emprunté");
            return false;
        }
        if (getDocStatut() == "emprunté"){
            SetStatut("pile retour");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean retour_etagère(){
        if (getDocStatut() == "pile retour"){
            SetStatut("étagère");
            return true;
        }
        else{
            return false;
        }
    }
}

