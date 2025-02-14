public class titling {
    public static void main(String[] args) {
        System.out.println("Titling :");
        System.out.println(titlecase("hello, _world!"));
    }
    public static String titlecase(String title){
        boolean goingToUpperCase = true;
        for (int i = 0; i < title.length(); i++) {
            if(goingToUpperCase){
                title = title.substring(0, i) + title.substring(i, i+1).toUpperCase() + title.substring(i+1);
                goingToUpperCase = false;
            }
       
            if(goingToUpperCase == false && (title.charAt(i) <= 90 && title.charAt(i) >= 65) || (title.charAt(i) >= 192 && title.charAt(i) <= 214) || (title.charAt(i) >= 216 && title.charAt(i) <= 222) || (title.charAt(i) >= 224 && title.charAt(i) <= 246) || (title.charAt(i) >= 248 && title.charAt(i) <= 254)){
                goingToUpperCase = true;
            }
        }
        return title;
    }
    
}
