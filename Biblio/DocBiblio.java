package Biblio;


public class DocBiblio {
    String code_archivage;
    String titre;
    String auteur;
    int annee_publication;
    String StatutDoc;
    String StatutDocPhysique = "étagère";
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
        this.StatutDoc = "disponible";
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
    public static int getCmpEmprunt(){
        return cmp_emprunt;
    }
    public static int getCmpEtagère(){
        return cmp_etagère;
    }
    public static int getCmpReservation(){
        return cmp_reservation;
    }
    public static int getCmpPileRetour(){
        return cmp_pile_retour;
    }
    public MembreBibliothèque getEmprunteur(){
        return emprunteur;
    }
    public MembreBibliothèque getReserviste(){
        return reserviste;
    }
    public String getDocStatutPhysique(){
        return StatutDocPhysique;
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
    public void SetDocStatutPhysique(String Statut){
        this.StatutDocPhysique = Statut;
    }
    
    //Methodes cycle de vie 

    public boolean emprunt(MembreBibliothèque Emprunteur){
        boolean resultat = false;
        if(getDocStatut().equals("disponible") && Emprunteur.peutemprunter()) 
        {
            SetStatut("emprunté");
            SetDocStatutPhysique("chez l'emprunteur");
            SetEmprunteur(Emprunteur);
            Emprunteur.incrementerNbEmprunt();
            cmp_emprunt++;
            cmp_etagère--;
            resultat = true;
        }
        else if (getDocStatutPhysique().equals("Section_réservée") && getDocStatut().equals("réservé") && getReserviste() == Emprunteur){
            SetStatut("emprunté");
            SetDocStatutPhysique("chez l'emprunteur");
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
        if(getDocStatut().equals("emprunté") && getEmprunteur().equals(Réserviste) != true){
            SetReserviste(Réserviste);
            SetStatut("réservé");
            resultat = true;
        }
        return resultat;
    }
    public boolean retour_docu(){
        boolean resultat = false;
        if (getDocStatut().equals("réservé") ) {
            SetDocStatutPhysique("Section_réservée");
            SetStatut("Section_réservée");
            getEmprunteur().decrementerNbEmprunt();
            SetEmprunteur(null);
            cmp_reservation++;
            resultat = true;
        }
        if (getDocStatut().equals("emprunté")){
            cmp_emprunt--;
            SetEmprunteur(null);
            SetStatut("pile retour");
            SetDocStatutPhysique("pile retour");
            cmp_pile_retour++;
            resultat = true;
        }
        return resultat;
    }
    public boolean retour_etagère(){
        boolean resultat = false;
        if (getDocStatut().equals("pile retour")){
            SetStatut("disponible");
            SetDocStatutPhysique("étagère");
            cmp_pile_retour--;
            cmp_etagère++;
            resultat = true;
        }
        return resultat;
    }

    public boolean annulation_reservation(MembreBibliothèque Réserviste){
        boolean resultat = false;
        if (getDocStatut().equals("Section_réservée") && getReserviste().equals(Réserviste)){
            SetStatut("pile retour");
            SetDocStatutPhysique("pile retour");
            SetReserviste(null);
            cmp_reservation--;
            resultat = true;
        }
        if (getDocStatut().equals("emprunté") && getEmprunteur().equals(Réserviste)){
            SetEmprunteur(null);
            SetStatut("emprunté");
            SetDocStatutPhysique("chez l'emprunteur");
            resultat = true;
        }
        return resultat;
    }
    //autres
    @SuppressWarnings("override")
    public String toString(){
        String resultat = "Code d'archivage: " + code_archivage + "\n" + "Titre: " + titre + "\n" + "Auteur: " + auteur + "\n" + "Année de publication: " + annee_publication + "\n" + "Statut: " + StatutDoc + "\n";
        return resultat;
    }
}

