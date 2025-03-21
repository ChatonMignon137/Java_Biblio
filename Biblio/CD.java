package Biblio;


import java.util.ArrayList;

public class CD extends DocBiblio {
    
    ArrayList<Object> listePistes;

    public CD(String code_archivage, String titre, String auteur, int annee_publication, ArrayList<Object> listePistes) {
        super(code_archivage, titre, auteur, annee_publication);
        this.listePistes = listePistes;
    }

    public ArrayList<Object> getListePistes(){
        return listePistes;
    }

    public String getArtiste(){
        return auteur;
    }

    public void setListePistes(ArrayList<Object> listePistes){
        this.listePistes = listePistes;
    }

    @Override
    public String toString() {
        return super.toString() + "CD{" + "listePistes=" + listePistes + '}';
    }
}
