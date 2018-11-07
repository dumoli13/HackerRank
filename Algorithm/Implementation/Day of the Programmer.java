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

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int date = 0;
        int month = 1;
        
        int[] handicapYear = {31,15,31,30,31,30,31,31,30,31,30,31};
        int[] regYear = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        int _date=0;
        int i=0;
        while(_date+regYear[i]<256){
            month++;
            if(year==1918) _date += handicapYear[i];
            else if(year>1918 && year%400==0) _date += leapYear[i];
            else if(year>1918 && year%100==0) _date += regYear[i];
            else if(year%4==0) _date += leapYear[i];
            else _date += regYear[i];
            i++;
        }
        
        date = 256-_date;
        
        String pDate;
        if(date<10) pDate = "0"+date; 
        else pDate = String.valueOf(date);
        
        String pMonth;
        if(month<10) pMonth = "0"+month; 
        else pMonth = String.valueOf(month);
        
        String day = pDate+"."+ pMonth +"."+year;
        return day;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
