package Biblio;

public class TestBibliothèque {
    public static void main(String[] args) {
        DocBiblio doc1 = new DocBiblio("004. 178 K20PM", "Introduction au java", "J.Leblanc", 2015);
        DocBiblio doc2 = new DocBiblio("967. 4987 T248O", "Structure de données", "M.Machin", 2022);
        DocBiblio doc3 = new DocBiblio("527. 4987 T2205", "Besoin d'IHM", "E.fayt", 2024);
        DocBiblio doc4 = new DocBiblio("121. 2121 21212", "50 nuances d'egrep" , "B.A", 1212);
        DocBiblio doc5 = new DocBiblio("003. 178 K20PM", "Yes or No La Jeunesse", "H.Keddoucci", 2015);
        DocBiblio doc6 = new DocBiblio("004. 162 K20PM", "PythonBetter", "D.Vachette", 2023);
        DocBiblio doc7 = new DocBiblio("004. 178 12KMH", "LinuxBetter", "G.Marion", 2022);
        DocBiblio doc8 = new DocBiblio("004. 178 ABIBJ", "PLSql", "E.Fayt", 2010);
        DocBiblio doc9 = new DocBiblio("004. 178 12123", "Tintin au Congo", "r.aciste", 2015);
        DocBiblio doc10 = new DocBiblio("011. 110 10100", "Compter sur ses doigt en binaire", "P.Andre",2005);

        MembreBibliothèque membre1 = new MembreBibliothèque("Chalon", "Emilien", "06.12.12.12.12", "40 rue de la zikette");
        MembreBibliothèque membre2 = new MembreBibliothèque("Germinagni", "Nicolas", "06.13.13.13.13", "13 rue du HESSQL");
        MembreBibliothèque membre3 = new MembreBibliothèque("Naudts", "Angelo","06.06.06.06.06", "1 rue de la rue");
        MembreBibliothèque membre4 = new MembreBibliothèque("Anquetil", "Nathalie", "07.07.07.07.07", "404 Rue du NotFound");
        MembreBibliothèque membre5 = new MembreBibliothèque("Bourbon", "Mehdi", "07.12.12.12.12", "404 Rue de la JCOF");
        MembreBibliothèque membre6 = new MembreBibliothèque("Pointeur", "Harriut", "06.11.11.11.11","12 rue de feyssine");
        MembreBibliothèque membre7 = new MembreBibliothèque("Chandon", "Basile", "01.15.15.15.15", "12 rue de la toupie");
        MembreBibliothèque membre8 = new MembreBibliothèque("Filliao", "luc", "06.05.05.05.05.05", "5 Rue de la présidence");
        MembreBibliothèque membre9 = new MembreBibliothèque("Besnard", "Valentin", "07.06.06.06.06.06", "12 rue du secrétariat");
        MembreBibliothèque membre10 = new MembreBibliothèque("Nouvel", "Armand", "06.05.04.03.02.01", "12 rue de la bible");

        // test to string
        System.out.println("Liste des Membres");
        System.out.println(membre1.getNom() + " " + membre1.getPrénom() + " " + membre1.getNuméroAbonnée());
        System.out.println();
        System.out.println(membre2.getNom() + " " + membre2.getPrénom() + " " + membre2.getNuméroAbonnée());
        System.out.println();
        System.out.println(membre3.getNom() + " " + membre3.getPrénom() + " " + membre3.getNuméroAbonnée());
        System.out.println();
        System.out.println(membre4.getNom() + " " + membre4.getPrénom() + " " + membre4.getNuméroAbonnée());
        System.out.println();
        System.out.println(membre5.getNom() + " " + membre5.getPrénom() + " " + membre5.getNuméroAbonnée());
        System.out.println();
        System.out.println(membre6.getNom() + " " + membre6.getPrénom() + " " + membre6.getNuméroAbonnée());
        System.out.println();
        System.out.println(membre7.getNom() + " " + membre7.getPrénom() + " " + membre7.getNuméroAbonnée());
        System.out.println();
        System.out.println(membre8.getNom() + " " + membre8.getPrénom() + " " + membre8.getNuméroAbonnée());
        System.out.println();
        System.out.println(membre9.getNom() + " " + membre9.getPrénom() + " " + membre9.getNuméroAbonnée());
        System.out.println();
        System.out.println(membre10.getNom() + " " + membre10.getPrénom() + " " + membre10.getNuméroAbonnée());
        System.out.println();
        System.out.println("Liste des oeuvres");
        System.out.println(doc1.getTitre() + " " + doc1.getAuteur() + " " + doc1.getAnneePublication());
        System.out.println();
        System.out.println(doc2.getTitre() + " " + doc2.getAuteur() + " " + doc2.getAnneePublication());
        System.out.println();
        System.out.println(doc3.getTitre() + " " + doc3.getAuteur() + " " + doc3.getAnneePublication());
        System.out.println();
        System.out.println(doc4.getTitre() + " " + doc4.getAuteur() + " " + doc4.getAnneePublication());
        System.out.println();
        System.out.println(doc5.getTitre() + " " + doc5.getAuteur() + " " + doc5.getAnneePublication());
        System.out.println();
        System.out.println(doc6.getTitre() + " " + doc6.getAuteur() + " " + doc6.getAnneePublication());
        System.out.println();
        System.out.println(doc7.getTitre() + " " + doc7.getAuteur() + " " + doc7.getAnneePublication());
        System.out.println();
        System.out.println(doc8.getTitre() + " " + doc8.getAuteur() + " " + doc8.getAnneePublication());
        System.out.println();
        System.out.println(doc9.getTitre() + " " + doc9.getAuteur() + " " + doc9.getAnneePublication());
        System.out.println();
        System.out.println(doc10.getTitre() + " " + doc10.getAuteur() + " " + doc10.getAnneePublication());

        // test des emprunts

        System.out.println("Test du cycle de vie basique d'un document");

        System.out.println("Le nombre de document emprunté est : " + doc1.getCmpEmprunt());
        System.out.println("Le nombre de document en étagère est : " + doc1.getCmpEtagère());
        System.out.println("Le nombre de document en pile de retour est : " + doc1.getCmpPileRetour());
        System.out.println("Le nombre de document réservé est : " + doc1.getCmpReservation());

        System.out.println("Le membre 1 emprunte le document 1");
        doc1.emprunt(membre1);
        System.out.println();
        System.out.println("Le membre 2 réserve le document 1");
        doc1.reservation(membre2);
        System.out.println();
        System.out.println("L'emprunteur du livre : " + doc1.titre + " Est : " + doc1.getEmprunteur().getNom() + " " + doc1.getEmprunteur().getPrénom() + " et son réserviste est : " + doc1.getReserviste().getNom()  + " " + doc1.getReserviste().getPrénom());
        System.out.println();
        System.out.println("Le nombre de document emprunté est : " + doc1.getCmpEmprunt());
        System.out.println("Le nombre de document en étagère est : " + doc1.getCmpEtagère());
        System.out.println("Le nombre de document en pile de retour est : " + doc1.getCmpPileRetour());
        System.out.println("Le nombre de document réservé est : " + doc1.getCmpReservation());
        System.out.println();
        System.out.println("Le membre 1 rend le document 1");
        doc1.retour_docu(doc1.getReserviste(), doc1.getEmprunteur());
        System.out.println();
        System.out.println("Le nombre de document emprunté est : " + doc1.getCmpEmprunt());
        System.out.println("Le nombre de document en étagère est : " + doc1.getCmpEtagère());
        System.out.println("Le nombre de document en pile de retour est : " + doc1.getCmpPileRetour());
        System.out.println("Le nombre de document réservé est : " + doc1.getCmpReservation());
        System.out.println();
        System.out.println("Son nouvelle emprunteur est donc : " + doc1.getEmprunteur().getNom() + " " + doc1.getEmprunteur().getPrénom());
        System.out.println();
        System.out.println("Le membre 2 rend le document 1");
        doc1.retour_docu(doc1.getReserviste(), doc1.getEmprunteur());
        System.out.println();
        System.out.println("Le nombre de document emprunté est : " + doc1.getCmpEmprunt());
        System.out.println("Le nombre de document en étagère est : " + doc1.getCmpEtagère());
        System.out.println("Le nombre de document en pile de retour est : " + doc1.getCmpPileRetour());
        System.out.println("Le nombre de document réservé est : " + doc1.getCmpReservation());
        System.out.println();
        System.out.println("Le bibliothécaire range le document 1");
        doc1.retour_etagère();
        System.out.println();
        System.out.println("Le nombre de document emprunté est : " + doc1.getCmpEmprunt());
        System.out.println("Le nombre de document en étagère est : " + doc1.getCmpEtagère());
        System.out.println("Le nombre de document en pile de retour est : " + doc1.getCmpPileRetour());
        System.out.println("Le nombre de document réservé est : " + doc1.getCmpReservation());
        System.out.println();
        
        System.out.println("Test du cycle de vie Avec erreur d'un document");
        System.out.println("Le membre 1 emprunte le document 1");
        doc1.emprunt(membre1);
        System.out.println();
        System.out.println("Le membre 2 emprunte le document 1 qui est déjà emprunté");
        doc1.emprunt(membre2);
        System.out.println();
        System.out.println("Le membre 2 rend le document 1");
        doc1.retour_docu(doc1.getReserviste(), doc1.getEmprunteur());
        System.out.println();
        System.out.println("Le Statut du doc 1 est :" + doc1.getDocStatut());
        System.out.println();
    }
}
