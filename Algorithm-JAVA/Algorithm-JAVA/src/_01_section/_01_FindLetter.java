package _01_section;

import java.util.Scanner;

/**
 * 1번 문자 찾기 : 문자 입력시 알파벳 같이 입력 > 그 알파벳이 문장 앞에 몇개나 포함돼 있는지 계산
 * 입력 예시 : aaabbc a / 출력 예시 : 3
 */
public class _01_FindLetter {

    public int solution(String str, char key) {
        int res = 0;
        // str, key 전부 대문자로 변환
        str = str.toUpperCase();
        key = Character.toUpperCase(key);
        // toCharArray : String 변수를 문자 하나하나 char 타입의 배열로 바꿔주는 메서드
        for (char i : str.toCharArray()) {
            // 만약 char i가 char key와 같다면 > res에 count
            if (i == key) res++;
        }
        return res;
    }

    public static void main(String[] args) {

        _01_FindLetter main = new _01_FindLetter();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char key = sc.next().charAt(0);
        // solution 메서드 호출해서 결과값 바로 출력
        System.out.println(main.solution(str, key));
    }
}
