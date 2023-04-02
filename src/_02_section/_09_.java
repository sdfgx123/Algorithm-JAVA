package _02_section;

import java.util.Scanner;

/**
 * 9번 : 격자판 최대합
 * n*n의 격자판에서 각 행, 각 열, 두 대각선의 합 중  가장 큰 합 출력
 */
public class _09_ {

//    public int solution(int n, int[][] arr) {
//        int sum = 0, max = 0;
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                sum += arr[i][j];
//            }
//            if (sum>max) max = sum;
//            for (int j=0; j<n; j++) {
//                sum += arr[j][i];
//            }
//            if (sum>max) max = sum;
//            for (int j=0; j<n; j++) {
//                if (i==j) {
//                    sum += arr[i][j];
//                }
//                if (sum>max) max = sum;
//            }
//        }
//        return max;
//    }

    public int solution(int n, int[][] arr) {
        /**
         * ans = 최솟값으로 정렬 / 최댓값이 발견될 때마다 업데이트
         */
        int ans = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i=0; i<n; i++) {
            sum1 = sum2 =0;
            for (int j=0; j<n; j++) {
                // sum1 : 행을 고정해서 더한 값 > 가로
                // sum2 : 열을 고정해서 더한 값 > 세로
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            ans = Math.max(ans, sum1);
            ans = Math.max(ans, sum2);
        }
        sum1 = sum2 = 0;
        for (int i=0; i<n; i++) {
            /**
             * sum1 : 우하향 하는 대각선
             * sum2 : 좌하향 하는 대각선
             */
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        ans = Math.max(ans, sum1);
        ans = Math.max(ans, sum2);
        return ans;
    }

    public static void main(String[] args) {
        _09_ main = new _09_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
