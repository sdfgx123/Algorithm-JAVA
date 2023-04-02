package _05_section;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호문자제거
 */
public class _02_ {

//    public String solution(String str) {
//        String answer = "";
//        Stack<Character> stack = new Stack<>();
//        for (char x : str.toCharArray()) {
//            if (x==')') {
//                while (stack.pop()!='(');
//            }
//            else stack.push(x);
//        }
//        for (int i=0; i<stack.size(); i++) answer += stack.get(i);
//        return answer;
//    }

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x==')') {
                while (stack.pop()!='(');
            } else stack.push(x);
        }
        for (int i=0; i<stack.size(); i++) answer += stack.get(i);
        return answer;
    }

    public static void main(String[] args) {
        _02_ main = new _02_();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
