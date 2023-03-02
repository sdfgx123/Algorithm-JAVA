package _02_section;

import java.util.Scanner;

/**
 * 11번 : 임시반장 정하기
 */
public class _11_ {

//    public int solution(int n, int[][] arr) {
//        int answer;
//        int[] cnt = new int[n];
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                if (arr[])
//            }
//        }
//        return 0;
//    }

    /**
     * 이해가 안되는 부분
     * i, j, k 다 1부터 시작인데
     * 첫번째 if 에서 비교할 때,
     * arr[1][1]==arr[1][1] 비교하는 거 아님?
     */
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i=1; i<=n; i++) {
            int cnt = 0;
            for (int j=1; j<=n; j++) {
                for (int k=1; k<=5; k++) {
                    if (arr[i][k]==arr[j][k]) {
                        cnt++;
                        // 중복하여 세는 것을 피하기 위해서
                        break;
                    }
                }
            }
            if (cnt>max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _11_ main = new _11_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //왜 arr 배열 범위를 n+1, 6으로 잡는지 이해 안됨
        int[][] arr = new int[n+1][6];
        for (int i=1; i<=n; i++) {
            // j for문 왜 5까지 잡는지 이해 안됨
            for (int j=1; j<=5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
