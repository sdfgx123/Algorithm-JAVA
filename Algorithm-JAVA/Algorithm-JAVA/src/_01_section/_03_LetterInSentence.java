package _01_section;

import java.util.Scanner;

/**
 * 3번 : 문장 속 단어
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어 출력하는 알고리즘
 * [입력 예] it is time to study
 * [출력 예] study
 *
 * 핵심은 최솟값 세팅해 두고, 더 큰 길이를 가진 string이 나오면 최솟값을 게속 업데이트 해주는 것임
 */
public class _03_LetterInSentence {

    // 풀이 1번
    public String solution(String str) {
        String res = "";
        int min = Integer.MIN_VALUE;
        // str을 공백을 기준으로 string 배열로 초기화
        String[] strings = str.split(" ");
        // forEach : string 배열 컴포넌트 하나씩 반복
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
        // min 변수를 최솟값으로 초기화
        int min = Integer.MIN_VALUE, pos;
        /**
         * pos 변수를, 공백이 등장했을 때의 인덱스로 초기화
         * -1이 나오는 경우는 공백이 없는 경우임
         * tmp 변수에, str을 0부터 pos 인덱스까지 잘라서 초기화 / 이때, 범위는 0 포함 0부터 pos 전까지임. pos index 포함 아님
         * indexOf : 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환, 만약 찾지 못할 경우 -1 반환
         */
        // while문 조건 : pos를 공백 나올 때의 인덱스로 초기화 > 이렇게 하면,
        while ((pos = str.indexOf(" ")) != -1) {
            // tmp를 공백으로 구분된 한 단어로 초기화
            String tmp = str.substring(0, pos);
            // len 단어 길이로 초기화
            int len = tmp.length();
            // 만약 단어 길이가 최솟값보다 크다면
            if (len > min) {
                // 단어 길이를 min으로 초기화
                min = len;
                // res를 해당 단어로 초기화
                res = tmp;
            }
            // str을 이전 단어까지 잘라내고 다음 단어부터 나오도록 초기화
            str = str.substring(pos+1);
        }
        // 이건 단어가 하나일 경우 res를 초기화 해주고 위해 작성한 코드
        if (str.length() > min) res = str;
        return res;
    }

    public static void main(String[] args) {
        _03_LetterInSentence main = new _03_LetterInSentence();
        Scanner sc = new Scanner(System.in);
        // nextLine() : 공백까지 포함해서 한 줄 전체를 다 받음
        String str = sc.nextLine();
        System.out.println(main.solution_02(str));

    }
}
