package _01_section;

import java.util.ArrayList;
import java.util.Scanner;

// 5번. 특정 문자 뒤집기
public class _05_LetterFlippingSpecific {

    public String solution(String str) {

        String res;
        // toCharArray : String 문장을 char 하나씩 따서 문자 배열로 바꿈
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            if (! Character.isAlphabetic(s[lt])) lt++;
            else if (! Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        // valueOf : String 클래스의 static 메서드 > String화 시켜줌
        res = String.valueOf(s);
        return res;
    }

    public static void main(String[] args) {

        _05_LetterFlippingSpecific main = new _05_LetterFlippingSpecific();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
