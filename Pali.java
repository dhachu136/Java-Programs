
import java.util.*;
class Pali
 {
    public static void main(String[] args) {
        String str = "M ad:am";
        str = str.toLowerCase();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                s.append(ch);
        }
        }
        System.out.println(s);
        Stack<Character>stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                stack.push(ch);
            }
            System.out.println(stack);
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(stack.pop()!=ch){
                    System.out.println("False");
                    return;
                }
            }
            if(stack.isEmpty()){
                System.out.println("True");
                
            }
        }
}
                
      