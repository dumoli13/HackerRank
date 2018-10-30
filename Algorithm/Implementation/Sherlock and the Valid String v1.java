import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String str){
       int max=0, min=0, oldMin=0, maxCount=0, minCount=0;
       
       Map<String, Integer> map = new LinkedHashMap<>();
       
       for(int i=0;i<str.length();i++){
           String temp = ""+str.charAt(i);
           map.merge(temp, 1, Integer::sum);
       }
       
       for(Map.Entry<String, Integer> value : map.entrySet()){
           
           if(max==0 || min==0) {
               max = value.getValue();
               min = value.getValue();
           }
           else if(value.getValue().compareTo(max)>0){
                max = value.getValue();
                maxCount = 0;
               
           }
           else if(value.getValue().compareTo(min)<0){
               oldMin=min;
               min = value.getValue();
               minCount = 0;
           }           
           
           if(value.getValue()==max) maxCount++;
           if(value.getValue()==min) minCount++;
                      
          System.out.println(value.getKey()+" "+value.getValue() + ". max Count: " + maxCount+ ". min Count: " + minCount);
       }
       System.out.println("max: "+max+", min: "+min+", oldmin: "+oldMin);
       if(min==max) return "YES";
       else if(max-min==1 && maxCount==1) return "YES";
       else if(max-oldMin==0 && min==1 && minCount==1) return "YES";
       
       return "NO";
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
