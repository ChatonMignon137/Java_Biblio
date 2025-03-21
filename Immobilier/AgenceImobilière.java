package immobilier;

public class AgenceImobilière {
    private static final int NB_MAX_BIEN = 10;
    @SuppressWarnings("FieldMayBeFinal")
    private BienImobilier[] biens;
    private int nbBiens;

    public AgenceImobilière() {
        biens = new BienImobilier[NB_MAX_BIEN];
        nbBiens = 0;
    }

    public boolean ajouterBien(BienImobilier bien) {
        boolean resultat = false;
        if (nbBiens < NB_MAX_BIEN) {
            biens[nbBiens] = bien;
            nbBiens++;
            resultat = true;
        }
        return resultat;
    }
    public void afficherBiens() {
        for (int i = 0; i < nbBiens; i++) {
            System.out.println(biens[i].toString());
            System.out.println();
        }
    }
    public int rechercheParRef(int bID) {
        int resultat = -1;
        for (int i = 0; i < nbBiens; i++) {
            if (biens[i].getbID() == bID) {
                System.out.println(biens[i].toString());
                System.out.println();
                resultat = bID;
            }
        }
        return resultat;
    }
    public int supprimerBien(int bID) {
        int resultat = -1;
        for (int i = 0; i < nbBiens; i++) {
            if (biens[i].getbID() == bID) {
                for (int j = i; j < nbBiens - 1; j++) {
                    biens[i] = biens[nbBiens - 1];
                }
                nbBiens--;
                resultat = bID;
            }
        }
        return resultat;
    }

}
//
