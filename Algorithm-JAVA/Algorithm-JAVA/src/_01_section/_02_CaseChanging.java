package _01_section;

import java.util.Scanner;

/**
 * 2번 문제 : 문자열 입력시 대소문자를 바꿔주는 문제
 * 문자열 입력시 : 소문자 > 대문자로, 대문자 > 소문자로 변환하여 출력
 */
public class _02_CaseChanging {

    public String solution(String str) {
        String res = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
//                Character.toUpperCase(x);
//                res += x;
                res += Character.toUpperCase(x);
            } else {
                res += Character.toLowerCase(x);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        _02_CaseChanging main = new _02_CaseChanging();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
