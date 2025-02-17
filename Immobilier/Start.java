package Immobilier;

public class Start {
    public static void main(String[] args) {
        BienImobilier Bien1 = new BienImobilier("Petite maison en campagne", 12,120,20.15,true,true, null , null);
        
        System.out.println("Description du bien 1 :");
        System.out.println(Bien1.getDescription());

        System.out.println("Prix au mètre ² :");
        System.out.println(Bien1.getPrixAuM2());

        System.out.println("La surface : ");
        System.out.println(Bien1.getSurface());

        System.out.println("son taux d'imposition :");
        System.out.println(Bien1.getTauxImposition());

        System.out.println("L'appartement est t'il louable");
        System.out.println(Bien1.getEstLouable());

        System.out.println("L'appartement est t'il Vendable");
        System.out.println(Bien1.getEstvendable());

        Bien1.setTaxeFonciere(Bien1.calculateTaxeFonciere());
        System.out.println("L'appartement a une taxe foncière pour 1 an de :");
        System.out.println(Bien1.getTaxeFonciere());

        System.out.println("Changement de la description pour building dans le 16 ème");
        Bien1.setdescription(" Building dans le 16eme");
        System.out.println(Bien1.getDescription());

        System.out.println("Prix parisien oblige il n'est plus vendable");
        Bien1.setEstVendable(false);
        System.out.println(Bien1.getEstvendable());

        System.out.println("Le prix explose et atteint les 1212");
        Bien1.setprixm2(14);
        System.out.println(Bien1.getPrixAuM2());

        System.out.println("Changement du taux d'imposition");
        Bien1.setTauxImposition(29.94);
        System.out.println(Bien1.getTauxImposition());

        System.out.println("Changement de la surface");
        Bien1.setSurface(30);
        System.out.println(Bien1.getSurface());

        System.out.println("Recalcul de la taxe foncière");
        Bien1.setTaxeFonciere(Bien1.calculateTaxeFonciere());
        System.out.println(Bien1.getTaxeFonciere());

        System.out.println("Changement de la louabilité");
        Bien1.setEstLouable(false);
        System.out.println(Bien1.getEstLouable());

        System.out.println("Test terminé");

        System.out.println("Ont ajoute un propriétaire et un locataire pour se bien");
        Locataire Loca1 = new Locataire("Ethan Fayt", "2 rue du paradis", 412,Bien1);
        Propriétaire Proprio1 = new Propriétaire("Crous", "1 rue de la précarité", false, 1200);

        System.out.println("résumée des infos du locataire 1");
        System.out.println();
        System.out.println("Son identitée");
        System.out.println();
        System.out.println(Loca1.getIdentitée());
        System.out.println();
        System.out.println("Son adresse");
        System.out.println();
        System.out.println(Loca1.getAdresse());
        System.out.println();
        System.out.println("Le montant de son loyer");
        System.out.println();
        System.out.println(Loca1.getMontantLoyer());
        System.out.println();
        System.out.println("Maintenant le propriétaire 1");
        System.out.println();
        System.out.println("Son identitée :" + Proprio1.getIdentitée() );
        System.out.println();
        System.out.println("Présence de résidence secondaire :" + Proprio1.getRésidenceSecondaire());
        System.out.println();
        System.out.println("Montant de sa taxe d'habitation :" + Proprio1.getMontantTaxeHabitation());
        System.out.println();
        System.out.println("Son adresse :" + Proprio1.getAdressePrincipal());
        System.out.println();
        System.out.println("Le crous devient propriétaire du bien 1 et Ethan son locataire");
        System.out.println();
        Bien1.setLocataire(Loca1);
        Bien1.setPropriétaire(Proprio1);
        System.out.println("Le locataire du " + Bien1.getDescription() + " est " + Bien1.getLocataire().getIdentitée());
        System.out.println();
        System.out.println("Le Propriétaire du " + Bien1.getDescription() + " est " + Bien1.getPropriétaire().getIdentitée());
        System.out.println();
        System.out.println("La taxe foncière du " + Bien1.getDescription() + " Qu'occupe " + Loca1.getIdentitée() + " est " + Loca1.getOccupe().getTaxeFonciere());

        
    }
}
