import java.util.*;

public class main {    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine();
        
        while (t-- > 0) {
            int count = 0;
            
            String str = sc.nextLine(); 
            int n = str.length();
            if (n == 0) {
                System.out.println("[]");
                break;
            }
            if(n>=10){
               char first = str.charAt(0); 
               char last = str.charAt(n - 1);
               for (int i = 1; i < n - 1; i++) { 
                  count++;
                }
                System.out.println(first + String.valueOf(count)+ last); 
            }
            else{
                System.out.println(str);
            }
            
            
        }
        sc.close();
    }
}
