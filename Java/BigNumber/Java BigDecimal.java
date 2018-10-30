import java.math.BigDecimal;
import java.util.*;

class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n+2];
		for(int i=0;i<n;i++){{
			s[i] = sc.next();
		}
		sc.close();
		
		Comparator<String> comparator = new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                BigDecimal a = new BigDecimal(t);
                BigDecimal b = new BigDecimal(t1);
                return b.compareTo(a);
            }
        };
        Arrays.sort(s,0,n,comparator);
		
		for(int i=0;i<n;i++){
			System.out.println(s[i]);
		}
	}
}