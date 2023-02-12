package _01_section;

import java.util.Scanner;

public class _08_Palindrome_B {

    public String solution(String str) {

        String res = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) res = "YES";
        return res;
    }

    public static void main(String[] args) {

        _08_Palindrome_B main = new _08_Palindrome_B();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }
}
