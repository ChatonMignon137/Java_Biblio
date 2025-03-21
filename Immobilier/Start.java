package immobilier;
import java.util.*;

public class Start {
    static BienImobilier Bien1 = new BienImobilier("Petite maison en campagne", 12, 120, 20.15, true, true, null, null);
    static BienImobilier Bien2 = new BienImobilier("Appartement en ville", 20, 200, 15.5, true, true, null, null);
    static BienImobilier Bien3 = new BienImobilier("Maison de campagne", 15, 150, 18.5, true, true, null, null);
    static BienImobilier Bien4 = new BienImobilier("Penthouse", 25, 250, 10.5, true, true, null, null);
    static Locataire Loca1 = new Locataire("Ethan Fayt", "2 rue du paradis", 412);
    static Propriétaire Proprio1 = new Propriétaire("Crous", "1 rue de la précarité", false, 1200);
    static Locataire Loca2 = new Locataire("Jean Dupont", "5 rue de la liberté", 500);
    static Propriétaire Proprio2 = new Propriétaire("Dupont", "5 rue de la liberté", true, 2000);
    static Scanner entree = new Scanner(System.in);
    static AgenceImobilière Agence1 = new AgenceImobilière();
    public static void main(String[] args) {
        Bien1.setLocataire(Loca1);
        Bien1.setPropriétaire(Proprio1);
        Bien2.setLocataire(Loca2);
        Bien2.setPropriétaire(Proprio2);
        Loca1.setOccupe(Bien1);
        Loca2.setOccupe(Bien2);
        if (Agence1.ajouterBien(Bien1) == true) {
            System.out.println("Bien ajouté avec succès");
        } else {
            System.out.println("Echec de l'ajout du bien");
        }
        if (Agence1.ajouterBien(Bien2) == true) {
            System.out.println("Bien ajouté avec succès");
        } else {
            System.out.println("Echec de l'ajout du bien");
        }

        int choix;
        
        do {
            System.out.println("Bienvenue dans le programme de gestion de bien immobillier");
            System.out.println("1. Afficher les informations d'un bien");
            System.out.println("2. Afficher les informations d'un propriétaire");
            System.out.println("3. Afficher les informations d'un locataire");
            System.out.println("4. Afficher l'état d'un bien");
            System.out.println("5. Modifier l'état d'un bien");
            System.out.println("6. Afficher les biens d'une agence");
            System.out.println("7. Recherche d'un bien par référence");
            System.out.println("8. Supprimer un bien");
            System.out.println("9. Quitter");
            System.out.println("Veuillez entrer le numéro de l'action que vous souhaitez effectuer");
            choix = entree.nextInt();
            entree.nextLine();
            switch (choix) {
                case 1 -> {
                    BienImobilier choixBien = choixBienImobilier();
                    System.out.println(choixBien.toString());
                }
                case 2 -> {
                    Propriétaire choixPropriétaire = choixPropriétaire();
                    System.out.println(choixPropriétaire.toString());
                }
                case 3 -> {
                    Locataire choixLocataire = choixLocataire();
                    System.out.println(choixLocataire.toString());
                }
                case 4 -> {
                    BienImobilier choixBien = choixBienImobilier();
                    if (choixBien.getEstLouable() == true) {
                        System.out.println("Le bien est louable");
                    } else {
                        System.out.println("Le bien n'est pas louable");
                    }
                    if (choixBien.getEstvendable() == true) {
                        System.out.println("Le bien est vendable");
                    } else {
                        System.out.println("Le bien n'est pas vendable");
                    }
                }
                case 5 -> {
                    BienImobilier choixBien = choixBienImobilier();
                    System.out.println("Voulez-vous rendre le bien louable ? (oui/non)");
                    String reponse = entree.nextLine();
                    if (reponse.equals("oui")) {
                        choixBien.setEstLouable(true);
                    } else {
                        choixBien.setEstLouable(false);
                    }
                    System.out.println("Voulez-vous rendre le bien vendable ? (oui/non)");
                    reponse = entree.nextLine();
                    if (reponse.equals("oui")) {
                        choixBien.setEstVendable(true);
                    } else {
                        choixBien.setEstVendable(false);
                    }
                }
                case 6 -> {
                    AgenceImobilière choixAgence = choixAgenceImobilière();
                    choixAgence.afficherBiens();
                }
                case 7 -> {
                    System.out.println("Veuillez entrer la référence du bien que vous recherchez");
                    int ref = entree.nextInt();
                    entree.nextLine();
                    AgenceImobilière choixAgence = choixAgenceImobilière();
                    if (choixAgence.rechercheParRef(ref) == ref){
                        System.out.println("Recherche réussie");
                    } else {
                        System.out.println("Recherche échouée");
                    }
                }
                case 8 -> {
                    System.out.println("Veuillez entrer la référence du bien que vous souhaitez supprimer");
                    int ref = entree.nextInt();
                    entree.nextLine();
                    AgenceImobilière choixAgence = choixAgenceImobilière();
                    if (choixAgence.supprimerBien(ref) == ref) {
                        System.out.println("Bien supprimé avec succès");
                    } else {
                        System.out.println("Echec de la suppression du bien");
                    }
                }
                case 9 -> System.out.println("Merci d'avoir utilisé notre programme");
                default -> System.out.println("Veuillez entrer un numéro valide");
            }
        } while (choix != 6);
        entree.close();
    }

    public static BienImobilier choixBienImobilier() {
        BienImobilier choixBien;
        do {
            System.out.println("Veuillez choisir un bien parmi les suivants : ");
            System.out.println("1. Petite maison en campagne");
            System.out.println("2. Appartement en ville");
            int choix = entree.nextInt();
            choixBien = switch (choix) {
                case 1 -> Bien1;
                case 2 -> Bien2;
                case 3 -> Bien3;
                case 4 -> Bien4;
                default -> null;
            };
        } while (choixBien == null);
        return choixBien;
    }

    public static Locataire choixLocataire(){
        Locataire choixLocataire;
        do {
            System.out.println("Veuillez choisir un locataire parmi les suivants : ");
            System.out.println("1. Ethan Fayt");
            System.out.println("2. Jean Dupont");
            int choix = entree.nextInt();
            choixLocataire = switch (choix) {
                case 1 -> Loca1;
                case 2 -> Loca2;
                default -> null;
            };
        } while (choixLocataire == null);
        return choixLocataire;
    }
    public static Propriétaire choixPropriétaire(){
        Propriétaire choixPropriétaire;
        do {
            System.out.println("Veuillez choisir un propriétaire parmi les suivants : ");
            System.out.println("1. Crous");
            System.out.println("2. Dupont");
            int choix = entree.nextInt();
            choixPropriétaire = switch (choix) {
                case 1 -> Proprio1;
                case 2 -> Proprio2;
                default -> null;
            };
        } while (choixPropriétaire == null);
        return choixPropriétaire;
    }

    public static AgenceImobilière choixAgenceImobilière() {
        AgenceImobilière Agence_choisie;
        do {
            System.out.println("Veuillez choisir une agence parmi les suivantes : ");
            System.out.println("1. Agence 1");
            int choix = entree.nextInt();
            Agence_choisie = switch (choix) {
                case 1 -> Agence1;
                default -> null;
            };
        }while (Agence_choisie == null);
        return Agence_choisie;
    }
}
