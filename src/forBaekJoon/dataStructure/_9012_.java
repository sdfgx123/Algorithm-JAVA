package forBaekJoon.dataStructure;

import java.beans.beancontext.BeanContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 9012. 괄호
 * 스택 사용, 괄호의 짝이 맞으면 YES, 짝이 맞지 않으면 NO
 */
public class _9012_ {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) sb.append(answer(br.readLine())).append('\n');
        System.out.println(sb);
    }

    public static String answer(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            }
            else if (stack.isEmpty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }

}
