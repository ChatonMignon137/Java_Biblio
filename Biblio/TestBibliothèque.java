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

        static MembreBibliothèque membre1 = new MembreEtudiant("Chalon", "Emilien", "06.12.12.12.12", "40 rue de la zikette");
        static MembreBibliothèque membre2 = new MembrePersonnel("Germignon", "Nicolas", "06.13.13.13.13", "13 rue du HESSQL");
        static MembreBibliothèque membre3 = new MembrePersonnel("Naudts", "Angelo","06.06.06.06.06", "1 rue de la rue");
        static MembreBibliothèque membre4 = new MembreEtudiant("Anquetil", "Nathalie", "07.07.07.07.07", "404 Rue du NotFound");
        static MembreBibliothèque membre5 = new MembreEtudiant("Bourbon", "Mehdi", "07.12.12.12.12", "404 Rue de la JCOF");
        static MembreBibliothèque membre6 = new MembrePersonnel("Pointeur", "Harriut", "06.11.11.11.11","12 rue de feyssine");
        static MembreBibliothèque membre7 = new MembreEtudiant("Chandon", "Basile", "01.15.15.15.15", "12 rue de la toupie");
        static MembreBibliothèque membre8 = new MembreEtudiant("Filliao", "luc", "06.05.05.05.05.05", "5 Rue de la présidence");
        static MembreBibliothèque membre9 = new MembreEtudiant("Besnard", "Valentin", "07.06.06.06.06.06", "12 rue du secrétariat");
        static MembreBibliothèque membre10 = new MembreEtudiant("Nouvel", "Armand", "06.05.04.03.02.01", "12 rue de la bible");
        static MembreBibliothèque choixMembreBibliothèque;
        static CatalogueBiblio catalogue = new CatalogueBiblio();
        static ListeMembre listeMembre = new ListeMembre();
        static DocBiblio livre1 = new Livre("004. 178 K20PM", "Introduction au java", "J.Leblanc", 2015, 200, "Eyrolles", "978-2-212-13456-7");
        static DocBiblio livre2 = new Livre("967. 4987 T248O", "Structure de données", "M.Machin", 2022, 300, "Dunod", "978-2-212-13456-7");
        @SuppressWarnings("Convert2Diamond")
        static DocBiblio cd1 = new CD("004. 178 K20PM", "Introduction au java", "J.Leblanc", 2015, new ArrayList<Object>(Arrays.asList("Piste 1", "Piste 2", "Piste 3")));
        @SuppressWarnings("Convert2Diamond")
        static DocBiblio cd2 = new CD("967. 4987 T248O", "Structure de données", "M.Machin", 2022, new ArrayList<Object>(Arrays.asList("Piste 1", "Piste 2", "Piste 3")));
        static DocBiblio DocUrl1 = new DocUrl("004. 178 K20PM", "Introduction au java", "J.Leblanc", 2015, "www.google.com", "Un livre sur le si java bien java mine");
        static DocBiblio DocUrl2 = new DocUrl("967. 4987 T248O", "Structure de données", "M.Machin", 2022, "www.google.com", "Un livre sur l'ancestral yes or no la jeunesse");
        

        static Scanner entree = new Scanner(System.in);
        static int choix;
        @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {
        listeMembre.addMembre(membre1);
        listeMembre.addMembre(membre2);
        catalogue.addDoc(doc1);
        catalogue.addDoc(doc2);
        do {
            System.out.println("Bienvenue dans le programme de gestion de la bibliothèque");
            System.out.println();
            System.out.println("1. Afficher les informations d'un document");
            System.out.println("2. Afficher l'état d'un document");
            System.out.println("3. Modifier l'état d'un document");
            System.out.println("4. Reservation d'un document");
            System.out.println("5. Nombre de document par emplacement");
            System.out.println("6. Afficher les informations des membre emprunteurs ou réservant un document");
            System.out.println("7. Afficher le catalogue");
            System.out.println("8. Afficher les documents empruntés");
            System.out.println("9. Afficher un document précis");
            System.out.println("10. Ajouter un document au catalogue");
            System.out.println("11. Supprimer un document du catalogue");
            System.out.println("12. Ajouter un membre à la bibliothèque");
            System.out.println("13. Afficher un membre de la bibliothèque");
            System.out.println("14. Emprunter un document du catalogue");
            System.out.println("15. Réserver un document du catalogue");
            System.out.println("16. Retourner un document du catalogue");
            System.out.println("17. Compte_Livre");
            System.out.println("18. Compte_CD");
            System.out.println("19. Quitter");
            System.out.println();
            System.out.println("-------------------------------------------------------------");
            System.out.println("Veuillez entrer le numéro de l'action que vous souhaitez effectuer");
            choix = entree.nextInt();
            entree.nextLine();
            switch (choix) {
                case 1 -> System.out.println(choixdocBiblio().toString());
                case 2 -> {
                    choixdocBiblio = choixdocBiblio();
                    System.out.println("le document est actuellement : " + choixdocBiblio.getDocStatut() + " dans la " + choixdocBiblio.StatutDocPhysique);
                }
                case 3 -> ChoixChangementEtat();
                case 4 -> {
                    choixdocBiblio = choixdocBiblio();
                    System.out.println("Veuillez entrer le numéro de l'abonné qui souhaite réserver le document");
                    choixMembreBibliothèque = choixMembreBibliothèque();
                    if (choixdocBiblio.reservation(choixMembreBibliothèque)) {
                        System.out.println("La réservation a bien été effectuée");
                    } else {
                        System.out.println("La réservation n'a pas pu être effectuée");
                    }
                }
                case 5 -> NbdocumentParEmplacement();
                case 6 -> {
                    choixdocBiblio = choixdocBiblio();
                    if (choixdocBiblio.getDocStatut().equals("emprunté")) {
                        System.out.println("Le document est actuellement emprunté par " + choixdocBiblio.getEmprunteur().toString());
                    } else if (choixdocBiblio.getDocStatut().equals("réservé")) {
                        System.out.println("Le document est actuellement réservé par " + choixdocBiblio.getReserviste().toString());
                    } else {
                        System.out.println("Le document n'est ni emprunté ni réservé");
                    }
                }
                case 7 -> catalogue.afficheCatalogue();
                case 8 -> catalogue.afficheEmprunte();
                case 9 -> {
                    System.out.println("Veuillez entrer le numéro du document que vous souhaitez afficher");
                    int i = entree.nextInt();
                    entree.nextLine();
                    System.out.println(catalogue.accesDoc(i).toString());
                }
                case 10 -> {
                    choixdocBiblio = choixdocBiblio();
                    if (catalogue.addDoc(choixdocBiblio)) {
                        System.out.println("Le document a bien été ajouté au catalogue");
                    } else {
                        System.out.println("Le document n'a pas pu être ajouté au catalogue");
                    }
                }
                case 11 -> {
                    choixdocBiblio = choixdocBiblio();
                    if (catalogue.suprDoc(choixdocBiblio)) {
                        System.out.println("Le document a bien été supprimé du catalogue");
                    } else {
                        System.out.println("Le document n'a pas pu être supprimé du catalogue");
                    }
                }
                case 12 -> {
                    choixMembreBibliothèque = choixMembreBibliothèque();
                    if (listeMembre.addMembre(choixMembreBibliothèque)) {
                        System.out.println("Le membre a bien été ajouté à la bibliothèque");
                    } else {
                        System.out.println("Le membre n'a pas pu être ajouté à la bibliothèque");
                    }
                }
                case 13 -> {
                    System.out.println("Veuillez entrer le numéro du membre que vous souhaitez afficher");
                    int i = entree.nextInt();
                    entree.nextLine();
                    System.out.println(listeMembre.accesMembre(i).toString());
                }
                case 14 -> {
                    System.out.println("Veuillez entrer le numéro du document que vous souhaitez emprunter");
                    int i = entree.nextInt();
                    entree.nextLine();
                    choixMembreBibliothèque = choixMembreBibliothèque();
                    if (catalogue.empruntDoc(i, choixMembreBibliothèque)) {
                        System.out.println("L'emprunt a bien été effectué");
                    } else {
                        System.out.println("L'emprunt n'a pas pu être effectué");
                    }
                }
                case 15 -> {
                    System.out.println("Veuillez entrer le numéro du document que vous souhaitez réserver");
                    int i = entree.nextInt();
                    entree.nextLine();
                    choixMembreBibliothèque = choixMembreBibliothèque();
                    if (catalogue.ReserveDoc(i, choixMembreBibliothèque)) {
                        System.out.println("La réservation a bien été effectuée");
                    } else {
                        System.out.println("La réservation n'a pas pu être effectuée");
                    }
                }
                case 16 -> {
                    System.out.println("Veuillez entrer le numéro du document que vous souhaitez retourner");
                    int i = entree.nextInt();
                    entree.nextLine();
                    if (catalogue.anulReservation(i, choixMembreBibliothèque)) {
                        System.out.println("Le retour a bien été effectué");
                    } else {
                        System.out.println("Le retour n'a pas pu être effectué");
                    }
                }
                    case 17 -> System.out.println("Le nombre de livre est de : " + catalogue.compteLivre());
                case 18 -> System.out.println("Le nombre de CD est de : " + catalogue.compteCD());
                case 19 -> System.out.println("Merci d'avoir utilisé notre programme");
                default -> {
                }
            }
        } while(choix != 19);
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
        System.out.println("11. " + livre1.getTitre());
        System.out.println("12. " + livre2.getTitre());
        System.out.println("13. " + cd1.getTitre());
        System.out.println("14. " + cd2.getTitre());
        System.out.println("15. " + DocUrl1.getTitre());
        System.out.println("16. " + DocUrl2.getTitre());
        int localChoix = entree.nextInt();
        entree.nextLine();
            return switch (localChoix) {
                case 1 -> doc1;
                case 2 -> doc2;
                case 3 -> doc3;
                case 4 -> doc4;
                case 5 -> doc5;
                case 6 -> doc6;
                case 7 -> doc7;
                case 8 -> doc8;
                case 9 -> doc9;
                case 10 -> doc10;
                case 11 -> livre1;
                case 12 -> livre2;
                case 13 -> cd1;
                case 14 -> cd2;
                case 15 -> DocUrl1;
                case 16 -> DocUrl2;
                default -> null;
            };
        }while(choix < 1 || choix > 16);
        }
    

    public static void NbdocumentParEmplacement() {
        System.out.println("Nombre de document par emplacement");
        System.out.println("Nombre de document sur l'étagère : " + DocBiblio.getCmpEtagère());
        System.out.println("Nombre de document emprunté : " + DocBiblio.getCmpEmprunt());
        System.out.println("Nombre de document réservé : " + DocBiblio.getCmpReservation());
        System.out.println("Nombre de document dans la pile de retour : " + DocBiblio.getCmpPileRetour());
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
                case 1 -> {
                    if(choixdocBiblio.emprunt(choixMembreBibliothèque)){
                        System.out.println("L'emprunt a bien été effectué");
                    }else{
                        System.out.println("L'emprunt n'a pas pu être effectué");
                    }
                }
                case 2 -> {
                    
                    if(choixdocBiblio.retour_docu()) {
                        System.out.println("Le retour a bien été effectué");
                    }else{
                        System.out.println("Le retour n'a pas pu être effectué");
                    }
                }
                case 3 -> {
                    if(choixdocBiblio.retour_etagère()){
                        System.out.println("Le retour à l'étagère a bien été effectué");
                    }
                    else{
                        System.out.println("Le retour à l'étagère n'a pas pu être effectué");
                    }
                }
                default -> {
                }
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
            int Localchoix = entree.nextInt();
            entree.nextLine();
            return switch (Localchoix) {
                case 1 -> membre1;
                case 2 -> membre2;
                case 3 -> membre3;
                case 4 -> membre4;
                case 5 -> membre5;
                case 6 -> membre6;
                case 7 -> membre7;
                case 8 -> membre8;
                case 9 -> membre9;
                case 10 -> membre10;
                default -> null;
            };
        }while(choix < 1 || choix > 10);
    }

}



