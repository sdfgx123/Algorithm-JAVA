package _05_section;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산(postfix)
 */
public class _04_ {

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            /**
             * 48 빼는 이유
             * 아스키 코드 48 = int 0, 49 = int 1, ... 이기 때문에
             * stack에 push하기 위해 char x를 아스키코드 표기법에 따라 48을 빼줘야 한다.
             */
            // if : x가 숫자일 경우
            if (Character.isDigit(x)) stack.push(x-48);
            // else : x가 숫자가 아닐 경우, 즉 연산자일 경우
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x=='+') stack.push(lt+rt);
                else if (x=='-') stack.push(lt-rt);
                else if (x=='*') stack.push(lt*rt);
                else if (x=='/') stack.push(lt/rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        _04_ main = new _04_();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
