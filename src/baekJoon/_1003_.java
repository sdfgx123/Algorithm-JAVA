package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1003. 피보나치 함수 문제
 */
public class _1003_ {

    /**
     * 메모이제이션을 위한 배열. [k][0]은 k에 대해 0이 호출된 횟수, [k][1]은 1이 호출된 횟수를 저장
     */
    static int[][] memo = new int[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // 메모 배열 초기화
        memo[0][0] = 1;
        memo[0][1] = 0;
        memo[1][0] = 0;
        memo[1][1] = 1;

        for (int i=0; i<n; i++) {
            int k = Integer.parseInt(br.readLine());
            int[] answer = fibonacci(k);
            sb.append(answer[0] + " " + answer[1] + '\n');
        }

        System.out.println(sb);
    }

    public static int[] fibonacci(int k) {

        // 만약 memo[k]에 값이 저장되어 있다면 그 값을 반환
        if ((memo[k][0] != 0 || memo[k][1] != 0) || k == 0 || k == 1) {
            return memo[k];
        }

        int[] result01 = fibonacci(k-1);
        int[] result02 = fibonacci(k-2);

        memo[k][0] = result01[0] + result02[0];
        memo[k][1] = result01[1] + result02[1];

        return memo[k];
    }
}
