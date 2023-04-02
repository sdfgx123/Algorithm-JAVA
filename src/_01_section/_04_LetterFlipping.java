package _01_section;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 4번 문제 문자 뒤집기
public class _04_LetterFlipping {

    // 방법 1 : 생 알고리즘으로 푸는 방법
    public ArrayList<String> solution(String[] str) {

        ArrayList<String> res = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;

            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            // StringBuilder 객체를 String화 시키기 위해서
            String tmp = String.valueOf(s);
            res.add(tmp);
        }

        return res;

    }

    // StringBuilder의 reverse 메서드 활용해서 쉽게 푸는 방법
    public ArrayList<String> solution_2(String[] str) {

        ArrayList<String> res = new ArrayList<>();

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            res.add(tmp);
        }

        return res;

    }

    public static void main(String[] args) {

        _04_LetterFlipping main = new _04_LetterFlipping();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String x : main.solution_2(str)) {
            System.out.println(x);
        }
    }
}
