package _01_section;

import java.util.Scanner;

public class _02_CaseChanging {

    public String solution(String str) {
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                Character.toUpperCase(x);
            } else {
                Character.toLowerCase(x);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        _02_CaseChanging main = new _02_CaseChanging();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
