package Immobilier;

public class Start {
    public static void main(String[] args) {
        BienImobilier Bien1 = new BienImobilier("Petite maison en campagne", 12,120,20.15,true,true);
        
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
        
    }
}
