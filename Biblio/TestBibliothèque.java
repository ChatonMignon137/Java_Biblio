package Biblio;

public class TestBibliothèque {
    public static void main(String[] args) {
        DocBiblio doc1 = new DocBiblio("004. 178 K20PM", "Introduction au java", "J.Leblanc", 2015);
        DocBiblio doc2 = new DocBiblio("967. 4987 T248O", "Structure de données", "M.Machin", 2022);

        // test des getters

        System.out.println("Information docu 1");
        System.out.println();
        System.out.println("Code d'archivage du document 1: " + doc1.getCodeArchivage());
        System.out.println("Titre du document 1" + doc1.getTitre());
        System.out.println("Auteur du document 1: " + doc1.getAuteur());
        System.out.println("Année de publication du document 1: " + doc1.getAnneePublication());
        System.out.println();
        System.out.println("Information docu 2");
        System.out.println();
        System.out.println("Code d'archivage du document 2: " + doc2.getCodeArchivage());
        System.out.println("Titre du document 2: " + doc2.getTitre());
        System.out.println("Auteur du document 2: " + doc2.getAuteur());
        System.out.println("Année de publication du document 2: " + doc2.getAnneePublication());

        // test des setters

        System.out.println("Utilisation des setters pour permuter le document 1 et le document 2");
        System.out.println();
        doc1.setCodeArchivage("967. 4987 T248O");
        doc1.setTitre("Structure de données");
        doc1.setAuteur("M.Machin");
        doc1.setAnneePublication(2022);
        doc2.setCodeArchivage("004. 178 K20PM");
        doc2.setTitre("Introduction au java");
        doc2.setAuteur("J.Leblanc");
        doc2.setAnneePublication(2015);
        System.out.println("Information docu 1");
        System.out.println();
        System.out.println("Code d'archivage du document 1: " + doc1.getCodeArchivage());
        System.out.println("Titre du document 1" + doc1.getTitre());
        System.out.println("Auteur du document 1: " + doc1.getAuteur());
        System.out.println("Année de publication du document 1: " + doc1.getAnneePublication());
        System.out.println();
        System.out.println("Information docu 2");
        System.out.println();
        System.out.println("Code d'archivage du document 2: " + doc2.getCodeArchivage());
        System.out.println("Titre du document 2: " + doc2.getTitre());
        System.out.println("Auteur du document 2: " + doc2.getAuteur());
        System.out.println("Année de publication du document 2: " + doc2.getAnneePublication());

        //Test du cycle de vie et du statut du document : 

        System.out.println("ont emprunte le document : ");
        doc1.emprunt();
        System.out.println("l'état du document est désormais :" + doc1.getDocStatut());
        System.out.println("ont essaye d'empruntée un document déjà empruntée :");
        doc1.emprunt();
        System.out.println("L'état du document est désormais :" + doc1.getDocStatut());
        System.out.println("Ont essaye de reservée un document déjà empruntée : ");
        doc1.reservation();
        System.out.println("l'état du document est désormais :" + doc1.getDocStatut());
        System.out.println("ont essaye de reservée un document qui n'as pas encore etait empruntée");
        doc2.reservation();
        System.out.println("l'état du document est désormais :" + doc2.getDocStatut());
        System.out.println("ont essaye de rendre un document qui n'est ni empruntée ni reservée");
        doc2.retour_docu();
        System.out.println("l'état du document est désormais :" + doc2.getDocStatut());
        System.out.println("ont essaye de remettre sur l'étagère un document qui s'y trouve déjà");
        doc2.retour_etagère();
        System.out.println("l'état du document est désormais :" + doc2.getDocStatut());
        System.out.println("Ont essaye de rendre un document a la fois empruntée et reservée");
        doc1.retour_docu();
        System.out.println("l'état du document est désormais :" + doc1.getDocStatut());
        System.out.println("Ont essaye de retourner un document qui est reservée");
        doc1.retour_docu();
        System.out.println("l'état du document est désormais :" + doc1.getDocStatut());
        System.out.println("ont rend un document emprunté uniquement");
        doc1.retour_docu();
        System.out.println("l'état du document est désormais :" + doc1.getDocStatut());
        System.out.println("Ont retourne un document présent a l'étagère ");
        doc1.retour_etagère();
        System.out.println("l'état du document est désormais :"+ doc1.getDocStatut());
    }
}
