package Biblio;

import java.util.ArrayList;

public class ListeMembre {
    ArrayList<MembreBibliothèque> listeMembre;
    int nbMembre;

    @SuppressWarnings("Convert2Diamond")
    public ListeMembre() {
        listeMembre = new ArrayList<MembreBibliothèque>();
        nbMembre = 0;
    }

    public boolean addMembre(MembreBibliothèque membre) {
        boolean resultat = false;
        if (listeMembre.contains(membre) == false) {
            if (listeMembre.add(membre)) {
                nbMembre++;
                resultat = true;
            } 
        }
        
        return resultat;
    }
    
    public MembreBibliothèque accesMembre(int i){
        if (i>=nbMembre || i<0) {
            return null;
            
        }
        return listeMembre.get(i);
    }
}
