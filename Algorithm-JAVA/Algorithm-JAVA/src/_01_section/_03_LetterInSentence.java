package _01_section;

import java.util.Scanner;

public class _03_LetterInSentence {

    // 풀이 1번
    public String solution(String str) {
        String res = "";
        int min = Integer.MIN_VALUE;
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println("strings : " + string);
            int len = string.length();
            if (len > min) {
                min = len;
                res = string;
            }
        }
        return res;
    }

    // 풀이 2번 : indexOf 활용해서 풀이
    public String solution_02(String str) {
        String res = "";
        int min = Integer.MIN_VALUE, pos;
        /**
         * pos 변수를, 공백이 등장했을 때의 인덱스로 초기화
         * -1이 나오는 경우는 공백이 없는 경우임
         * tmp 변수에, str을 0부터 pos 인덱스까지 잘라서 초기화 / 이때, 범위는 0 포함 0부터 pos 전까지임. pos index 포함 아님
         */
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > min) {
                min = len;
                res = tmp;
            }
            str = str.substring(pos+1);
        }
        if (str.length() > min) res = str;
        return res;
    }

    public static void main(String[] args) {
        _03_LetterInSentence main = new _03_LetterInSentence();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution_02(str));

    }
}
