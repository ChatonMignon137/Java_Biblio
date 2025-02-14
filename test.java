class test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("C'EST DU PUTAIN DE C#");

        char malettre = 'a';
        boolean monbooleen = true;
        monbooleen = malettre != 'S';
        System.out.println(monbooleen);
        char talettre = 'b';
        monbooleen = malettre == 'S' && talettre == 'S';
        System.out.println(monbooleen);
        int tonage = 18;
        int monage = 18;
        monbooleen = tonage == 19 || tonage == 20;
        System.out.println(monbooleen);
        monbooleen = monage>=15 && monage<=40;
        System.out.println(monbooleen);
    }
}

