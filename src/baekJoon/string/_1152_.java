package baekJoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1152. 단어의 개수 B2
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 * 입력 : 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 문자열은 공백으로 시작하거나 끝날 수 있다.
 * 출력 : 첫째 줄에 단어의 개수를 출력한다.
 */
public class _1152_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();

        if (str.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] parts = str.trim().split("\\s+");
        System.out.println(parts.length);
    }
}
