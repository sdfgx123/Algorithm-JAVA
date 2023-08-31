package baekJoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2941. 크로아티아 알파벳
 * 입력 : 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.단어는 크로아티아 알파벳으로 이루어져 있다.
 * 출력 : 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 */
public class _2941_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int cnt = 0;

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'c' && i+1 < str.length()) {
                if (str.charAt(i+1) == '=') i++;
                else if (str.charAt(i+1) == '-') i++;
            }

            else if (ch == 'd' && i+1 < str.length()) {
                if (str.charAt(i+1) == '-') i++;
                else if (i+2 < str.length()) {
                    if (str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') i += 2;
                }
            }

            else if (ch == 'l' && i+1 < str.length()) {
                if (str.charAt(i+1) == 'j') i++;
            }

            else if (ch == 'n' && i+1 < str.length()) {
                if (str.charAt(i+1) == 'j') i++;
            }

            else if (ch == 's' && i+1 < str.length()) {
                if (str.charAt(i+1) == '=') i++;
            }

            else if (ch == 'z' && i+1 < str.length()) {
                if (str.charAt(i+1) == '=') i++;
            }

            cnt++;
        }
        System.out.println(cnt);
    }
}
