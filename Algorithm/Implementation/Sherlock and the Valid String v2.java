import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s){
        Map<Character, Integer> map = new HashMap<>();
        int max=0, min=0, maxCount=0, minCount=0;
        for(int i=0;i<s.length();i++){
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        List<Integer> list = new ArrayList<>(map.values()) ;
        max = Collections.max(list);
        min = Collections.min(list);
        maxCount = Collections.frequency(list, max);
        minCount = Collections.frequency(list, min);
       
        if(max-min>1 && minCount==1 && maxCount==1) return "NO";
        else if(max==min) return "YES";
        else if(max==min+1 && maxCount==1) return "YES";
        else if(min==1 && minCount==1) return "YES";
        else return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
