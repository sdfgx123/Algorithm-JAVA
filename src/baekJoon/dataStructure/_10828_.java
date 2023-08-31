package baekJoon.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 10828. 스택
 *
 */
public class _10828_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            String[] parts = str.split(" ");

            if (parts[0].equals("push")) stack.push(Integer.parseInt(parts[1]));
            if (parts[0].equals("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(stack.peek() + "\n");
                }
            }
            if (parts[0].equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(stack.pop() + "\n");
                }
            }
            if (parts[0].equals("empty")) {
                if (stack.isEmpty()) {
                    sb.append(1 + "\n");
                }
                else {
                    sb.append(0 + "\n");
                }
            }
            if (parts[0].equals("size")) {
                sb.append(stack.size() + "\n");
            }
        }
        System.out.println(sb);
    }
}
