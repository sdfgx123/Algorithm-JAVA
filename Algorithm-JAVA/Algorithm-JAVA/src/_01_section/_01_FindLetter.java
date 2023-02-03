package _01_section;

import java.util.Scanner;

// 문자 입력시 알파벳을 같이 입력하면 그 알파벳이 문장 안에 몇개나 포함되어 있는지 계산하는 알고리즘
public class _01_FindLetter {

    public int solution(String str, char key) {
        int res = 0;
        str = str.toUpperCase();
        key = Character.toUpperCase(key);
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
