package forBaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2748. 피보나치 수 2
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램 작성
 * 입력 : n
 * 출력 : n번째 피보나치 수 출력
 */
public class _2748_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Long[] answer = new Long[n+1];

        answer[0] = 0L;
        answer[1] = 1L;

        for (int i=2; i<=n; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }

        System.out.println(answer[n]);

    }
}
