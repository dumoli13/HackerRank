import java.io.*;
import java.util.*;

public class Solution {
    
    static int solution(int length, int[] arr, int sum){
        int count = 0;
        // if (length<=1) return 0;
        
        for(int i=0; i<length; i++){
            int subSum = 0;
            for(int j=i; j<length; j++){
                if(i==j) subSum = arr[j];
                else subSum += arr[j];
                
                if(subSum<0) {
                        count++;
                        // System.out.print(subSum + ", ");
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];
        
        int sum = 0;
        for(int i=0; i<length;i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        scan.close();
        
        System.out.println(solution(length, arr, sum));
        
    }
}