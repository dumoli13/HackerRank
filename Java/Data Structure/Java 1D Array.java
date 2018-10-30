import java.util.*;

public class solution{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		String[] a = new String[n];
        for(int i=0;i<n;i++){
            String str = scan.next();
            a[i]=str;
        }
		
		scan.close();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}