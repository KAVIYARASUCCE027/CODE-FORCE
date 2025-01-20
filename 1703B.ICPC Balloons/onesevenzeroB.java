import java.util.*;

public class onesevenzeroB{
    public static void main(String[] arhs){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
        while(t-->0){
            
             int count=0;
             int n=sc.nextInt();
             sc.nextLine();
             String s=sc.nextLine();
             HashSet<Character> arr=new HashSet<>();
             for(int i=0;i<n;i++){
                 char c=s.charAt(i);
                 if(arr.contains(c)){
                     count=count+1;
                     
                 }
                 else{
                     count =count+2;
                     arr.add(c);
                     
                 }
             }
             System.out.println(count);
            
        }
    }
}