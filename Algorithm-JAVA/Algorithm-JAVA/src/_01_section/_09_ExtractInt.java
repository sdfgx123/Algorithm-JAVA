package _01_section;

import java.util.Scanner;

public class _09_ExtractInt {

    public int solution(String str) {

        String res = "";

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) res += x;
        }

        return Integer.parseInt(res);
    }

    public static void main(String[] args) {

        _09_ExtractInt main = new _09_ExtractInt();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
