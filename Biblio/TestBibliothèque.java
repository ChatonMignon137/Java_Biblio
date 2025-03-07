package Biblio;

import java.util.*;
public class TestBibliothèque {

    static DocBiblio doc1 = new DocBiblio("004. 178 K20PM", "Introduction au java", "J.Leblanc", 2015);
        static DocBiblio doc2 = new DocBiblio("967. 4987 T248O", "Structure de données", "M.Machin", 2022);
        static DocBiblio doc3 = new DocBiblio("527. 4987 T2205", "Besoin d'IHM", "E.fayt", 2024);
        static DocBiblio doc4 = new DocBiblio("121. 2121 21212", "50 nuances d'egrep" , "B.A", 1212);
        static DocBiblio doc5 = new DocBiblio("003. 178 K20PM", "Yes or No La Jeunesse", "H.Keddoucci", 2015);
        static DocBiblio doc6 = new DocBiblio("004. 162 K20PM", "PythonBetter", "D.Vachette", 2023);
        static DocBiblio doc7 = new DocBiblio("004. 178 12KMH", "LinuxBetter", "G.Marion", 2022);
        static DocBiblio doc8 = new DocBiblio("004. 178 ABIBJ", "PLSql", "E.Fayt", 2010);
        static DocBiblio doc9 = new DocBiblio("004. 178 12123", "Tintin au Congo", "r.aciste", 2015);
        static DocBiblio doc10 = new DocBiblio("011. 110 10100", "Compter sur ses doigt en binaire", "P.Andre",2005);
        static DocBiblio choixdocBiblio;

        static MembreBibliothèque membre1 = new MembreBibliothèque("Chalon", "Emilien", "06.12.12.12.12", "40 rue de la zikette");
        static MembreBibliothèque membre2 = new MembreBibliothèque("Germignon", "Nicolas", "06.13.13.13.13", "13 rue du HESSQL");
        static MembreBibliothèque membre3 = new MembreBibliothèque("Naudts", "Angelo","06.06.06.06.06", "1 rue de la rue");
        static MembreBibliothèque membre4 = new MembreBibliothèque("Anquetil", "Nathalie", "07.07.07.07.07", "404 Rue du NotFound");
        static MembreBibliothèque membre5 = new MembreBibliothèque("Bourbon", "Mehdi", "07.12.12.12.12", "404 Rue de la JCOF");
        static MembreBibliothèque membre6 = new MembreBibliothèque("Pointeur", "Harriut", "06.11.11.11.11","12 rue de feyssine");
        static MembreBibliothèque membre7 = new MembreBibliothèque("Chandon", "Basile", "01.15.15.15.15", "12 rue de la toupie");
        static MembreBibliothèque membre8 = new MembreBibliothèque("Filliao", "luc", "06.05.05.05.05.05", "5 Rue de la présidence");
        static MembreBibliothèque membre9 = new MembreBibliothèque("Besnard", "Valentin", "07.06.06.06.06.06", "12 rue du secrétariat");
        static MembreBibliothèque membre10 = new MembreBibliothèque("Nouvel", "Armand", "06.05.04.03.02.01", "12 rue de la bible");
        static MembreBibliothèque choixMembreBibliothèque;

        static Scanner entree = new Scanner(System.in);
        static int choix;
    public static void main(String[] args) {
        do {
            System.out.println("Bienvenue dans le programme de gestion de la bibliothèque");
            System.out.println();
            System.out.println("1. Afficher les informations d'un document");
            System.out.println("2. Afficher l'état d'un document");
            System.out.println("3. Modifier l'état d'un document");
            System.out.println("4. Reservation d'un document");
            System.out.println("5. Nombre de document par emplacement");
            System.out.println("6. Afficher les informations des membre emprunteurs ou réservant un document");
            System.out.println("7. Quitter");
            System.out.println();
            System.out.println("-------------------------------------------------------------");
            System.out.println("Veuillez entrer le numéro de l'action que vous souhaitez effectuer");
            choix = entree.nextInt();
            entree.nextLine();
            switch (choix) {
                case 1:
                    System.out.println(choixdocBiblio().toString());
                    break;
                case 2:
                    choixdocBiblio = choixdocBiblio();
                    System.out.println("le document est actuellement : " + choixdocBiblio.getDocStatut() + " dans la " + choixdocBiblio.StatutDocPhysique);
                    break;
                case 3:
                    ChoixChangementEtat();
                    break;
                case 4:
                    choixdocBiblio = choixdocBiblio();
                    System.out.println("Veuillez entrer le numéro de l'abonné qui souhaite réserver le document");
                    choixMembreBibliothèque = choixMembreBibliothèque();
                    if (choixdocBiblio.reservation(choixMembreBibliothèque)) {
                        System.out.println("La réservation a bien été effectuée");
                    } else {
                        System.out.println("La réservation n'a pas pu être effectuée");
                    }
                    break;
                case 5:
                    NbdocumentParEmplacement();
                    break;
                case 6:
                    choixdocBiblio = choixdocBiblio();
                    if (choixdocBiblio.getDocStatut().equals("emprunté")) {
                        System.out.println("Le document est actuellement emprunté par " + choixdocBiblio.getEmprunteur().toString());
                    } else if (choixdocBiblio.getDocStatut().equals("réservé")) {
                        System.out.println("Le document est actuellement réservé par " + choixdocBiblio.getReserviste().toString());
                    } else {
                        System.out.println("Le document n'est ni emprunté ni réservé");
                    }
                    break;
            
                default:
                    break;
            }
        } while(choix != 7);
    }

    public static DocBiblio choixdocBiblio() {
        do
        {
        System.out.println("Veuillez choisir un document");
        System.out.println("1. " + doc1.getTitre());
        System.out.println("2. " + doc2.getTitre());
        System.out.println("3. " + doc3.getTitre());
        System.out.println("4. " + doc4.getTitre());
        System.out.println("5. " + doc5.getTitre());
        System.out.println("6. " + doc6.getTitre());
        System.out.println("7. " + doc7.getTitre());
        System.out.println("8. " + doc8.getTitre());
        System.out.println("9. " + doc9.getTitre());
        System.out.println("10. " + doc10.getTitre());
        int choix = entree.nextInt();
        entree.nextLine();
        switch (choix) {
            case 1:
                return doc1;
            case 2:
                return doc2;
            case 3:
                return doc3;
            case 4:
                return doc4;
            case 5:
                return doc5;
            case 6:
                return doc6;
            case 7:
                return doc7;
            case 8:
                return doc8;
            case 9:
                return doc9;
            case 10:
                return doc10;
            default:
                return null;
            }
        }while(choix < 1 || choix > 10);
        }
    

    public static void NbdocumentParEmplacement() {
        System.out.println("Nombre de document par emplacement");
        System.out.println("Nombre de document sur l'étagère : " + doc1.getCmpEtagère());
        System.out.println("Nombre de document emprunté : " + doc1.getCmpEmprunt());
        System.out.println("Nombre de document réservé : " + doc1.getCmpReservation());
        System.out.println("Nombre de document dans la pile de retour : " + doc1.getCmpPileRetour());
    }

    public static void ChoixChangementEtat(){
        choixdocBiblio = choixdocBiblio();
        choixMembreBibliothèque = choixMembreBibliothèque();
        do{
            System.out.println("Veuillez choisir le nouveau statut du document");
            System.out.println("1. Emprunt");
            System.out.println("2. Retour");
            System.out.println("3. Retour à l'étagère");
            choix = entree.nextInt();
            entree.nextLine();
            switch (choix) {
                case 1:
                    if(choixdocBiblio.emprunt(choixMembreBibliothèque)){
                        System.out.println("L'emprunt a bien été effectué");
                    }else{
                        System.out.println("L'emprunt n'a pas pu être effectué");
                    }
                    break;
                case 2:
                    if(choixdocBiblio.retour_docu()) {
                        System.out.println("Le retour a bien été effectué");
                    }else{
                        System.out.println("Le retour n'a pas pu être effectué");
                    }
                    break;
                case 3:
                    if(choixdocBiblio.retour_etagère()){
                        System.out.println("Le retour à l'étagère a bien été effectué");
                    }
                    else{
                        System.out.println("Le retour à l'étagère n'a pas pu être effectué");
                    }
                    break;
                default:
                    break;
            }

        }
        while(choix < 1 || choix > 3);
    }

    public static MembreBibliothèque choixMembreBibliothèque(){
        do{
            System.out.println("Veuillez choisir un membre");
            System.out.println("1. " + membre1.getNom());
            System.out.println("2. " + membre2.getNom());
            System.out.println("3. " + membre3.getNom());
            System.out.println("4. " + membre4.getNom());
            System.out.println("5. " + membre5.getNom());
            System.out.println("6. " + membre6.getNom());
            System.out.println("7. " + membre7.getNom());
            System.out.println("8. " + membre8.getNom());
            System.out.println("9. " + membre9.getNom());
            System.out.println("10. " + membre10.getNom());
            int choix = entree.nextInt();
            entree.nextLine();
            switch (choix) {
                case 1:
                    return membre1;
                case 2:
                    return membre2;
                case 3:
                    return membre3;
                case 4:
                    return membre4;
                case 5:
                    return membre5;
                case 6:
                    return membre6;
                case 7:
                    return membre7;
                case 8:
                    return membre8;
                case 9:
                    return membre9;
                case 10:
                    return membre10;
                default:
                    return null;
            }
        }while(choix < 1 || choix > 10);
    }

}



