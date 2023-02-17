package _01_section;

import java.util.Scanner;

/**
 * 11번 문자열 압축
 * 알파벳 대문자 한 줄 받아서 > 중복되는 문자 있으면 뒤에 숫자 써주면서 출력
 * 입력 예 KKHSSSSSSSE, 출력 예 K2HS7E
 */
public class _11_CompressingString {

    public String solution(String str) {

        String res = "";
        // str에 공백 추가하는 이유 : 공백 추가해 줘야 for문 마지막 반복에서 마지막 문자만 출력하고 반복 종료할 수 있기 때문에
        str = str + " ";
        // cnt 1로 초기화 해서 반복되면 cnt++ > cnt 1씩 증분
        int cnt = 1;

        // i = 0부터 i-1 까지 반복 > i-1까지 반복하는 이유 : i-1까지 반복해야 마지막 문자 출력하고 반복 종료할 수 있기 때문에
        for (int i = 0; i < str.length() - 1; i++) {
            // 만약 i번째 문자와 i+1번째 문자가 같다면 > cnt++
            if (str.charAt(i) == str.charAt(i+1)) cnt++;
            // 다르다면 > res에 문자 추가
            else {
                res += str.charAt(i);
                // 이때, 만약 cnt가 1보다 크다면 > cnt 변수를 int -> string으로 string.valueOf 메서드 써서 res가 추가
                if (cnt > 1) res += String.valueOf(cnt);
                // 문자 추가해 줬으니까 cnt는 1로 다시 초기화
                cnt = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        _11_CompressingString main = new _11_CompressingString();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
