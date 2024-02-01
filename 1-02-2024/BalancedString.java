import java.util.*;
public class BalancedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
       // String input = "(()()()";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
              st.push('(');
            }
            else if(input.charAt(i)==')'){
                st.pop();
            }
        }
        System.out.println(st.size());
        sc.close();
    }
}
