import java.util.*;

/**
 * MultiplyStrings
 */
public class MultiplyStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine(); 
        String output="";
        // int num1=0;
        // int num2=0;
        // for(int i=0;i<A.length();i++){
        //     num1=num1*10;
        //     num1+=A.charAt(i)-'0';
        // }
        // for(int i=0;i<B.length();i++){
        //     num2=num2*10;
        //     num2+=B.charAt(i)-'0';
        // }
        // System.out.println(num1*num2);


        int res[] = new int [A.length()+B.length()];
        if(A=="0" || B=="0"){
            System.out.println("0");
            sc.close();
            return;
        }
        for(int i=A.length()-1;i>=0;i--){
            for(int j=B.length()-1;j>=0;j--){
                res[i+j+1] = res[i+j+1] + ((A.charAt(i)-'0')*(B.charAt(j)-'0'));
                res[i+j]+=res[i+j+1]/10;
                res[i+j+1]%=10;
            }
        }
        
        int i=0;
        while(i<res.length && res[i]==0){
             i++;
        }
        while(i<res.length){
            output+=(char)(res[i]+'0');
            i++;
        }
        System.out.println(output);
        sc.close();
    }
}