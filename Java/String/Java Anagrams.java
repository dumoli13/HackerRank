import java.util.Scanner;

public class Solution {
	static voolean isAnagram(String a, String b){
		a = a.toLowerCase();
        b = b.toLowerCase();
        
        if(a.length()==0 || b.length()==0) return false;
        else if(a.length()!=b.length())return false;
        else{            
            String[] arrayA = a.split("");
            String[] arrayB = b.split("");
            
            for(int i=0;i<a.length()-1;i++){
                for(int j=i+1;j<a.length();j++){
                    if(arrayA[i].compareTo(arrayA[j])>0){
                        String x = arrayA[j];
                        arrayA[j] = arrayA[i];
                        arrayA[i] = x;
                    }
                    if(arrayB[i].compareTo(arrayB[j])>0){
                        String x = arrayB[j];
                        arrayB[j] = arrayB[i];
                        arrayB[i] = x;
                    }
                }
            }
            
            for(int i=0;i<a.length();i++){
                if(!arrayA[i].equals(arrayB[i])){
                    return false;
                }
            }
        }
        return true;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret)? "Anagrams" : "Not Anagrams");
	}
}