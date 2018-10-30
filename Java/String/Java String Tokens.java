import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
		s = s.trim();
        if(s.length()==0) System.out.print(0);
        else{
            String[] array = s.split("[^a-zA-Z]+");
            System.out.println(array.length);
            for(String print : array){
                System.out.println(print);
            }
        }
		
        scan.close();
    }
}

