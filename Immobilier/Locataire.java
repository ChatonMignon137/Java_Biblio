package Immobilier;

public class Locataire {
    private String Identitée;
    private String Adresse;    
    private int MontantLoyer;
    private BienImobilier Occupe;

    public  Locataire(String Identitée, String Adresse, int MontantLoyer,BienImobilier Occupe){
        this.Adresse = Adresse;
        this.Identitée = Identitée;
        this.MontantLoyer = MontantLoyer;    
        this.Occupe = Occupe;
    }

    public String getIdentitée(){
        return Identitée;
    }

    public String getAdresse(){
        return Adresse;
    }

    public int getMontantLoyer(){
        return MontantLoyer;
    }
    public BienImobilier getOccupe(){
        return Occupe;
    }
    public void setOccupe(BienImobilier Occupe){
        this.Occupe = Occupe;
    }

    public void setMontantLoyer(int MontantLoyer){
        this.MontantLoyer = MontantLoyer;
    }
    public void setAdresse(String adresse){
        this.Adresse = adresse;
    }
    public void setIdentitée(String Identitée){
        this.Identitée = Identitée;
    }
    public String toString(){
        return "Locataire : " + Identitée + " habite au " + Adresse + " et paye un loyer de " + MontantLoyer + "€ pour le bien " + Occupe.getDescription();
    }
    
}
