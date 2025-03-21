package Biblio;

public class DocUrl extends DocBiblio {
    
    String url;
    String description;
    
    public DocUrl(String code_archivage, String titre, String auteur, int annee_publication, String url, String description) {
        super(code_archivage, titre, auteur, annee_publication);
        this.url = url;
        this.description = description;
        this.StatutDoc = "disponible";
        this.StatutDocPhysique = "null";
    }

    public String getUrl(){
        return url;
    }
    public String getDescription(){
        return description;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public void setDescription(String Description){
        this.description = Description;
    }

    @Override
    public boolean emprunt(MembreBibliothèque Emprunteur){
        return false;
    }

    @Override
    public boolean retour_docu(){
        return false;
    }
    
    @Override
    public boolean reservation(MembreBibliothèque Réserviste){
        return false;
    }
    @Override
    public boolean retour_etagère(){
        return false;
    }
}
