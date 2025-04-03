package Main.huiwen;
import java.util.Scanner;
import java.util.Stack;
public class huiwen {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner (System.in);
        String num = scanner.nextLine();
        for(int i = 0;i<num.length();i++){
            char c = num.charAt(i);
            stack.push(c);
        }
        StringBuilder after = new StringBuilder();
        while(!stack.isEmpty()){
            char c = stack.pop();
            after.append(c);
        }
        String result = after.toString();
        if (num.equals(result)) {
            System.out.println(num+"是一个回文数。");
        }
        else{
            System.out.println(num+"不是一个回文数。");
        }
            scanner.close();
    }
}
