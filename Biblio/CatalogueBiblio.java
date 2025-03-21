package Biblio;

import java.util.ArrayList;

public class CatalogueBiblio {
    ArrayList<DocBiblio> catalogue;
    int nbDoc;

    @SuppressWarnings("Convert2Diamond")
    public CatalogueBiblio() {
        catalogue = new ArrayList<DocBiblio>();
        nbDoc = 0;
    }

    public boolean addDoc(DocBiblio doc) {
        boolean resultat = false;
        if (catalogue.contains(doc) == false) {
            if (catalogue.add(doc)) {
                nbDoc++;
                resultat = true;
            } 
        }
        return resultat;
    }

    public boolean suprDoc(DocBiblio doc) {
        boolean resultat = false;
        if (catalogue.contains(doc)) {
            if (catalogue.remove(doc)) {
                nbDoc--;
                resultat = true;
            }
        }
        return resultat;
    }
    public DocBiblio accesDoc(int i){
        if (i>=nbDoc || i<0) {
            return null;
        }
        return catalogue.get(i);
    }
    public void afficheCatalogue(){
        int i;
        for (i = 0; i < nbDoc; i++) {
            System.out.println("Document n°" + i);
            System.out.println(catalogue.get(i).toString());
        }
        if (i == 0) {
            System.out.println("Catalogue vide");
        }
    }
    @SuppressWarnings("empty-statement")
    public void afficheEmprunte(){;
        if (DocBiblio.getCmpEmprunt() == 0) {
            System.out.println("Aucun document n'est emprunté");
        }
        for (int i = 0; i < nbDoc; i++) {
            if (catalogue.get(i).getDocStatut().equals("emprunté")) {
                System.out.println("Document n°" + i);
                System.out.println(catalogue.get(i).toString());
            }
        }
    }
    public boolean empruntDoc(int indiceDoc, MembreBibliothèque membre){
        boolean resultat = false;
        DocBiblio doc = accesDoc(indiceDoc);
        if (doc.getDocStatut().equals("disponible") && membre.peutemprunter()) {
            doc.emprunt(membre);
            resultat = true;
        }
        return resultat;
    }
    public boolean ReserveDoc(int indiceDoc, MembreBibliothèque membre){
        boolean resultat = false;
        DocBiblio doc = accesDoc(indiceDoc);
        if (doc.getDocStatut().equals("disponible")) {
            doc.reservation(membre);
            resultat = true;
        }
        return resultat;
    }
    public boolean anulReservation(int indiceDoc, MembreBibliothèque membre){
        boolean resultat = false;
        DocBiblio doc = accesDoc(indiceDoc);
        if (doc.getDocStatut().equals("réservé") && doc.getReserviste().equals(membre)) {
            doc.annulation_reservation(membre);
            resultat = true;
        }
        return resultat;
    }
    public boolean retourDoc(int indiceDoc){
        boolean resultat = false;
        DocBiblio doc = accesDoc(indiceDoc);
        if (doc.getDocStatut().equals("chez l'emprunteur")) {
            doc.retour_docu();
            resultat = true;
        }
        return resultat;
    }
    public int compteLivre(){
        int nbLivre = 0;
        for (int i = 0; i < nbDoc; i++) {
            if (catalogue.get(i) instanceof Livre) {
                nbLivre++;
            }
        }
        return nbLivre;
    }
    public int compteCD(){
        int nbCD = 0;
        for (int i = 0; i < nbDoc; i++) {
            if (catalogue.get(i) instanceof CD) {
                nbCD++;
            }
        }
        return nbCD;
    }
}
