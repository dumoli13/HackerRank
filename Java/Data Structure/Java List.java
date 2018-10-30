import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<size;i++){
            int value = scan.nextInt();
            list.add(value);
        }
        
        int _command = scan.nextInt();
        for(int i=0;i<_command;i++){
            String command = scan.next();
            if(command.equals("Insert")){
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            }
            else if(command.equals("Delete")){
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        for(int x : list){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}