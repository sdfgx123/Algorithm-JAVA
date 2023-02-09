package _01_section;

import java.util.Scanner;

public class _07_Palindrome {

    public String solution(String str) {

        String res = "";

        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (s[lt] != s[rt]) {
                res = "NO";
                break;
            } else {
                res = "YES";
                lt++;
                rt--;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        _07_Palindrome main = new _07_Palindrome();
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();
        System.out.println(main.solution(str));

    }
}
