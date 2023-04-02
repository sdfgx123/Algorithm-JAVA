package _05_section;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 교육과정 설계
 */
public class _07_ {

//    public String solution(String cmp, String str) {
//        String answer = "YES";
//        Queue<Character> Q = new LinkedList<>();
//        for (int i=0; i<str.length(); i++) Q.offer(str.charAt(i));
//        while ()
//        return answer;
//    }

    public String solution(String cmp, String str) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : cmp.toCharArray()) Q.offer(x);
        for (char x : str.toCharArray()) {
            if (Q.contains(x)) {
                if (x!=Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        _07_ main = new _07_();
        Scanner sc = new Scanner(System.in);
        String cmp = sc.next();
        String str = sc.next();
        System.out.println(main.solution(cmp, str));
    }
}
