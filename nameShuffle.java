//Ameer Ahmed

public class Main {

    public static String nameShuffle(String s) {
 
        String[] parts = s.split(" ");
        return parts[1] + " " + parts[0];
    }

    public static void main(String[] args) {
        System.out.println(nameShuffle("Risa Oribe"));
        
    }
}