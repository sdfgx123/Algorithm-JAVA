package _02_section;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 4번 문제 : 피보나치 수열
 * int n 입력받으면, n만큼의 항의 피보나치 수열 반환
 * 배열의 0번, 1번 인덱스는 1로 고정해 놔야 for문 돌릴 수 있음
 */

public class _04_Fibonacci {

    public int[] solution(int n) {

        // 0번, 1번 인덱스는 무조건 1로 초기화 해줘야 함
        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 1;

        for (int i=2; i<n; i++) {
            ans[i] += ans[i - 2] + ans[i - 1];
        }

        return ans;
    }

    /**
     * 풀이 2번 : a, b, c 변수 써서 풀었음 > 이게 더 효율적인 것 같음
     */
    public void solution_2(int n) {
        int a = 1, b = 1, c;
        System.out.println(a + " " + b + " ");
        for (int i=2; i<n; i++) {
            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        _04_Fibonacci main = new _04_Fibonacci();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int x : main.solution(n)) System.out.println(x + " ");
    }
}
