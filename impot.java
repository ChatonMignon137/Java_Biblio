public class impot {
    public static void main(String[] args) {
        System.out.println("Impot :");
        System.out.println(calculimpot(-1000));

    }
    public static double calculimpot(double revenu){
        double impot = 0;
        int tranche1 = 20_000;
        int tranche2 = 40_000;
        int tranche3 = 60_000;
        if (revenu <= 0){
            impot = 0;
        }
        else if(revenu <= tranche1){
            impot = revenu*0.05;
        }else if(revenu <= tranche2){
            impot = tranche1*0.05 + (revenu-tranche1)*0.1;
        }else if(revenu <= tranche3){
            impot = tranche1*0.05 + tranche1*0.1 + (revenu-tranche2)*0.15;
        }else if(revenu > tranche3){
            impot = tranche1*0.05 + tranche1*0.1 + tranche1*0.2 + (revenu-tranche3)*0.3;
    }
    return impot;
    }
}
