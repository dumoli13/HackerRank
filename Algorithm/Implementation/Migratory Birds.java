import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int[] bird = new int[5];
        int value = 0;
        for(int i=0;i<arr.size();i++){
            switch (arr.get(i)){
                case 1 : 
                    bird[0]++;
                    break;
                case 2 :
                    bird[1]++;
                    break;
                case 3 :
                    bird[2]++;
                    break;
                case 4 : 
                    bird[3]++;
                    break;
                case 5 : 
                    bird[4]++;
            }
        }
        
        int _result = 0;
        for(int i=0;i<5;i++){
            if(bird[i]>_result){
                value = i+1;
                _result = bird[i];
            }
        }
        return value;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
