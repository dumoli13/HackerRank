import java.util.*;
import java.security.MessageDigest;

public class HackerRank2 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String output = "";
        scan.close();
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] digest = md.digest();
            for(byte b : digest){
                System.out.printf("%02x", b);
            }
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}