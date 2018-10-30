import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger big1 = scanner.nextBigInteger();
        BigInteger big2 = scanner.nextBigInteger();
        
        System.out.println(big1.add(big2));
        System.out.println(big1.multiply(big2));
    }
}