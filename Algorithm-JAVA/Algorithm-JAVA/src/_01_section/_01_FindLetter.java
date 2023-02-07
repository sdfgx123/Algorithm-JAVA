package _01_section;

import java.util.Scanner;

// 1번. 문자 찾기 : 문자 입력시 알파벳을 같이 입력하면 그 알파벳이 문장 안에 몇개나 포함되어 있는지 계산하는 알고리즘
public class _01_FindLetter {

    public int solution(String str, char key) {
        int res = 0;
        str = str.toUpperCase();
        key = Character.toUpperCase(key);
        // toCharArray : String 변수를 문자 하나하나 배열로 바꿔주는 메서드
        for (char i : str.toCharArray()) {
            if (i == key) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        _01_FindLetter main = new _01_FindLetter();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char key = sc.next().charAt(0);
        System.out.println(main.solution(str, key));
    }
}
