import java.util.Scanner;

/**
 * TotalStrings
 */
public class TotalStrings {

    public static void main(String[] args) {
        //if all a's
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //if all a's
        int count =1;

        //if 1b or 1c or rest a 
        count+=2*n;

        //all a's 2c's
        count+=n*(n-1)/2;

        //1b and 1c rest a
        count+=n*(n-1);

        //2c and 1b rest a
        count+=n*(n-1)*(n-2)/2;

        System.out.println(count);

        sc.close();

    }
}