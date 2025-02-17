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
        System.out.println(membre1);
        System.out.println();
        System.out.println(membre2);
        System.out.println();
        System.out.println(membre3);
        System.out.println();
        System.out.println(membre4);
        System.out.println();
        System.out.println(membre5);
        System.out.println();
        System.out.println(membre6);
        System.out.println();
        System.out.println(membre7);
        System.out.println();
        System.out.println(membre8);
        System.out.println();
        System.out.println(membre9);
        System.out.println();
        System.out.println(membre10);
        System.out.println();
        System.out.println("Liste des oeuvres");
        System.out.println(doc1);
        System.out.println();
        System.out.println(doc2);
        System.out.println();
        System.out.println(doc3);
        System.out.println();
        System.out.println(doc4);
        System.out.println();
        System.out.println(doc5);
        System.out.println();
        System.out.println(doc6);
        System.out.println();
        System.out.println(doc7);
        System.out.println();
        System.out.println(doc8);
        System.out.println();
        System.out.println(doc9);
        System.out.println();
        System.out.println(doc10);

        // test des emprunts

        System.out.println("Le membre 1 emprunte le document 1");
        doc1.emprunt(membre1);
        System.out.println();
        System.out.println("Le membre 2 réserve le document 1");
        doc1.reservation(membre2);
        System.out.println();
        System.out.println("L'emprunteur du livre : " + doc1.titre + " Est : " + doc1.getEmprunteur().getNom() + " " + doc1.getEmprunteur().getPrénom() + " et son réserviste est : " + doc1.getReserviste().getNom()  + " " + doc1.getReserviste().getPrénom());
    }
}
