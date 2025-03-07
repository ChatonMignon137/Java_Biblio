package Immobilier;

public class Propriétaire {
    String Identitée;
    String AdressePrincipal;
    Boolean RésidenceSecondaire;
    int MontantTaxeHabitation;

    public Propriétaire(String Identitée, String AdressePrincipal, Boolean RésidenceSecondaire, int MontantTaxeHabitation){
        this.AdressePrincipal = AdressePrincipal;
        this.Identitée = Identitée;
        this.RésidenceSecondaire = RésidenceSecondaire;
        this.MontantTaxeHabitation = MontantTaxeHabitation;
    }

    public int getMontantTaxeHabitation(){
        return MontantTaxeHabitation;
    }
    public String getIdentitée(){
        return Identitée;
    }
    public String getAdressePrincipal(){
        return AdressePrincipal;
    }
    public Boolean getRésidenceSecondaire(){
        return RésidenceSecondaire;
    }

    public void setMontantTaxeHabitation(int MontantTaxeHabitation){
        this.MontantTaxeHabitation = MontantTaxeHabitation;
    }

    public void setIdentitée(String Identitée){
        this.Identitée = Identitée;
    }
    public void setRésidenceSecondaire(Boolean RésidenceSecondaire){
        this.RésidenceSecondaire = RésidenceSecondaire;
    }
    public void setAdressePrincipal(String AdressePrincipal){
        this.AdressePrincipal = AdressePrincipal;
    }
    public String toString(){
        return "Propriétaire : " + Identitée + " habite au " + AdressePrincipal + " et paye une taxe d'habitation de " + MontantTaxeHabitation + "€";
    }

}
