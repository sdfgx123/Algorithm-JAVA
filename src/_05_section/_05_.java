package _05_section;

import java.util.Scanner;
import java.util.Stack;

/**
 * 쇠막대기
 */
public class _05_ {

    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='(') stack.push('(');
            else {
                // ) 만나면, 일단 pop 해서 (를 하나 빼줘야 한다.
                stack.pop();
                // 만약 바로 이전 괄호가 (라면, 레이저 라는 뜻이므로 stack의 사이즈만큼 answer를 증분해야 한다.
                if (str.charAt(i-1)=='(') answer += stack.size();
                // 바로 이전 괄호가 )라면, 레이저가 아니라 막대기 라는 뜻이므로 answer++ 해야 한다. 왜냐하면 자투리만 남기 때문이다.
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _05_ main = new _05_();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
