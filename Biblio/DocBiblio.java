package Biblio;


public class DocBiblio {
    String code_archivage;
    String titre;
    String auteur;
    int annee_publication;
    String StatutDoc;
    static private int cmp_emprunt;
    static private int cmp_reservation;
    static private int cmp_pile_retour;
    MembreBibliothèque Emprunteur = null;
    MembreBibliothèque Reserviste = null;

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
    public int getCmpEmprunt(){
        return cmp_emprunt;
    }
    public int getCmpReservation(){
        return cmp_reservation;
    }
    public int getCmpPileRetour(){
        return cmp_pile_retour;
    }
    public MembreBibliothèque getEmprunteur(){
        return Emprunteur;
    }
    public MembreBibliothèque getReserviste(){
        return Reserviste;
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
    public void SetEmprunteur(MembreBibliothèque Emprunteur){
        this.Emprunteur = Emprunteur;
    }
    public void SetReserviste(MembreBibliothèque Réserviste){
        this.Reserviste = Réserviste;
    }
    
    //Methodes cycle de vie 

    public boolean emprunt(MembreBibliothèque Emprunteur){
        if(getDocStatut() ==  "étagère")
        {
            SetStatut("emprunté");
            SetEmprunteur(Emprunteur);
            cmp_emprunt++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean reservation(MembreBibliothèque Réserviste){
        if(getDocStatut() == "emprunté"){
            SetReserviste(Réserviste);
            SetStatut("réservée");
            cmp_reservation++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean retour_docu(MembreBibliothèque Réserviste){
        if (getDocStatut() == "réservée") {
            SetStatut("emprunté");
            SetEmprunteur(Réserviste);
            cmp_reservation--;
            return false;
        }
        if (getDocStatut() == "emprunté"){
            cmp_emprunt--;
            SetEmprunteur(null);
            SetStatut("pile retour");
            cmp_pile_retour++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean retour_etagère(){
        if (getDocStatut() == "pile retour"){
            SetStatut("étagère");
            cmp_pile_retour--;
            return true;
        }
        else{
            return false;
        }
    }
    //autres
    public String toString;
}

