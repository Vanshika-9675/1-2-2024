import java.util.Scanner;

/**
 * SimilarStrings
 */
public class SimilarStrings {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String A1="";
        String A2="";
        String B1="";
        String B2="";
        if(A.length()!=B.length()) 
        {
            System.out.println(0);
        }
        if (A.equals(B)) {
            System.out.println(1);
        }
        int n = A.length();
        for(int i=0;i<n/2;i++){
             A1+=A.charAt(i);
             B1+=B.charAt(i);
             A2+=A.charAt(n-i-1);
             B2+=B.charAt(n-i-1);
        }
        if(A1.equals(B1) && A2.equals(B2)){
            System.out.println(1);
        }
        else if(A1.equals(B2) && A2.equals(B1)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        sc.close();
   }
    
}