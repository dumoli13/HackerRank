import java.util.*;
class Solution{
	
	public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            String[] a = input.split("");
            Map<String, Integer> map = new LinkedHashMap();
            map.put("[",0);
            map.put("{",0);
            map.put("(",0);
            
            boolean asFormat = true;
        
            for(int i=0;i<a.length;i++){
                if("[".equals(a[i])) map.merge("[", 1, Integer::sum);
                if("]".equals(a[i])) {
                    if(map.get("[")>0) map.merge("[", -1, Integer::sum);
                    else asFormat = false;
                }
                if("{".equals(a[i])) map.merge("{", 1, Integer::sum);
                if("}".equals(a[i])) {
                    if(map.get("{")>0) map.merge("{", -1, Integer::sum);
                    else asFormat = false;
                }
                if("(".equals(a[i])) map.merge("(", 1, Integer::sum);
                if(")".equals(a[i])){
                    if(map.get("(")>0) map.merge("(", -1, Integer::sum);
                    else asFormat = false;
                }
            }

            if(asFormat){
                if(map.get("[")!=0 || map.get("{")!=0 || map.get("(")!=0) System.out.println("false");
                else System.out.println("true");
            }
            else System.out.println("false");
        }
    }
    
}



