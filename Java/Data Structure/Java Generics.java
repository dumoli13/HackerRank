import java.io.IOException;
import java.lang.reflect.Method;

class Printer{
	static void printArray(Object[] a){
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
   }
}

public class Solution{
	public static void main(String[] args){
		Printer myPrinter = new Printer();
		Integer[] intArray = {1, 2, 3};
		String[] stringArray = {"Hello", "World"};
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		int count = 0;
	}
}
