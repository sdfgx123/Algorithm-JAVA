package _02_section;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Winner {

    /**
     * 3번 문제 : 가위바위보
     * A, B 누가 이기느냐에 따라 A 또는 B 출력
     * 가위 1 바위 2 보 3 으로 초기화
     * 비길 경우 D 출력
     * [입력 예제]
     * 5
     * 23313
     * 11223
     * [출력 예제]
     * ABABD (줄 바꿔서 출력해야 함)
     */

    // 기본적으로 두 가지 고려해서 코딩 : 1) 비길 경우, 2) A가 이길 경우를 기준으로 코드 작성 > 경우의 수가 줄어듦
    public String solution(int n, int[] a, int[] b) {
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) ans += "D";
            else if (a[i] == 1 && b[i] == 3) ans += "A";
            else if (a[i] == 2 && b[i] == 1) ans += "A";
            else if (a[i] == 3 && b[i] == 2) ans += "A";
            else ans += "B";
        }
        return ans;
    }

    public static void main(String[] args) {
        _03_Winner main = new _03_Winner();
        Scanner sc = new Scanner(System.in);

        // n 시행 횟수, a A가 내는 경우의 수, b B가 내는 경우의 수
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // 굳이 forEach 쓰는 이유 : 줄바꿈 해서 출력하려고, forEach 써서 string 반환값 char로 하나씩 출력
        for (char x : main.solution(n, a, b).toCharArray()) System.out.println(x);
    }
}
