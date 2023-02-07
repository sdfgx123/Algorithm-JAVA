package _01_section;

import java.util.Scanner;

// 6. 중복 문자 제거
public class _06_DeleteDuplication {

    public String solution(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) res += str.charAt(i);
        }

        return res;
    }

    public static void main(String[] args) {

        _06_DeleteDuplication main = new _06_DeleteDuplication();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
