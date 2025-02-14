public class conversions {
    public static void main(String[] args) {
        char malettre = 'é';
        conversion(malettre);
    }


        public static void conversion(char malettre){
        if (malettre >= 65 && malettre <= 90) {
            System.out.println("C'est une majuscule");
            malettre += 32;
            System.out.println("la version minuscule est :");
            System.out.println(malettre);
        } else if (malettre >= 97 && malettre <= 122) {
            System.out.println("C'est une minuscule");
                malettre -= 32;
                System.out.println("la version majuscule est :");
                System.out.println(malettre);
            } else if (malettre >= 192 && malettre <= 214 || malettre >= 216 && malettre <= 222) {
                System.out.println("C'est une majuscule accentuée");
                malettre += 32;
                System.out.println("la version minuscule accentuée est :");
                System.out.println(malettre);
            } else if (malettre >= 224 && malettre <= 246 || malettre >= 248 && malettre <= 254) {
                System.out.println("C'est une minuscule accentuée");
                malettre -= 32;
                System.out.println("la version majuscule accentuée est :");
                System.out.println(malettre);
            } else {
                System.out.println("Ce n'est pas une lettre");
        }
        }
    }