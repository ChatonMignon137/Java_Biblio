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
    static private int cmp_etagère;
    MembreBibliothèque emprunteur = null;
    MembreBibliothèque reserviste = null;

    // Constructor

    public DocBiblio(String code_archivage, String titre, String auteur, int annee_publication ) {
        this.code_archivage = code_archivage;
        this.titre = titre;
        this.auteur = auteur;
        this.annee_publication = annee_publication;
        this.StatutDoc = "étagère";
        cmp_etagère++;
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
    public  int getCmpEmprunt(){
        return cmp_emprunt;
    }
    public int getCmpEtagère(){
        return cmp_etagère;
    }
    public  int getCmpReservation(){
        return cmp_reservation;
    }
    public  int getCmpPileRetour(){
        return cmp_pile_retour;
    }
    public MembreBibliothèque getEmprunteur(){
        return emprunteur;
    }
    public MembreBibliothèque getReserviste(){
        return reserviste;
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
        this.emprunteur = Emprunteur;
    }
    public void SetReserviste(MembreBibliothèque Réserviste){
        this.reserviste = Réserviste;
    }
    
    //Methodes cycle de vie 

    public boolean emprunt(MembreBibliothèque Emprunteur){
        boolean resultat = false;
        if(getDocStatut().equals("étagère")  )
        {
            SetStatut("emprunté");
            SetEmprunteur(Emprunteur);
            cmp_emprunt++;
            cmp_etagère--;
            resultat = true;
        }
        else if (getDocStatut().equals("réservée") && getReserviste() == Emprunteur){
            SetStatut("emprunté");
            SetEmprunteur(Emprunteur);
            SetReserviste(null);
            cmp_emprunt++;
            cmp_reservation--;
            resultat = true;
        }
        return resultat;
    }
    public boolean reservation(MembreBibliothèque Réserviste){
        boolean resultat = false;
        if(getDocStatut().equals("emprunté")){
            SetReserviste(Réserviste);
            SetStatut("réservée");
            cmp_reservation++;
            resultat = true;
        }
        return resultat;
    }
    public boolean retour_docu(MembreBibliothèque Réserviste, MembreBibliothèque Client){
        boolean resultat = false;
        if (getDocStatut().equals("réservée") && getEmprunteur().equals(Client) ) {
            SetStatut("emprunté");
            SetEmprunteur(Réserviste);
            cmp_reservation--;
            resultat = true;
        }
        if (getDocStatut().equals("emprunté") && getEmprunteur().equals(Client)){
            cmp_emprunt--;
            SetEmprunteur(null);
            SetStatut("pile retour");
            cmp_pile_retour++;
            resultat = true;
        }
        return resultat;
    }
    public boolean retour_etagère(){
        boolean resultat = false;
        if (getDocStatut().equals("pile retour")){
            SetStatut("étagère");
            cmp_pile_retour--;
            cmp_etagère++;
            resultat = true;
        }
        return resultat;
    }
    //autres
    public String toString;
}

