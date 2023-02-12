package _01_section;

import java.util.Scanner;

public class _08_Palindrome_B {

    public String solution(String str) {

        String res = "";
        str = str.toUpperCase();

        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

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

        _08_Palindrome_B main = new _08_Palindrome_B();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));


    }
}
