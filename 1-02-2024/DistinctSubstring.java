import java.util.Arrays;
import java.util.Scanner;

public class DistinctSubstring {
    public static void main(String[] args) {
        int arr[] = new int[26];
        Arrays.fill(arr, 0);
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();

         int res=0;
         for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
         }
         for(int x:arr){
            if(x>1){
                res+=x-1;
            }
         }
         System.out.println(res);
         sc.close();
    }
}
