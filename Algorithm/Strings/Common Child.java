import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int commonChild1(String s1, String s2){
        int[][] arr = new int[s1.length()+1][s2.length()+1];
        
        for(int i=0;i<s1.length();i++){
            for(int j=0; j<s2.length();j++){
                int value = 0;
                if(s1.charAt(i)==s2.charAt(j)){
                    value = arr[i][j] + 1;
                }
                else{
                    value = Math.max(arr[i][j+1], arr[i+1][j]);
                }
                arr[i+1][j+1] = value;
            }
        }
        
        return arr[s1.length()][s2.length()];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild1(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
