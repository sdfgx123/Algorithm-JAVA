package _03_section;

import java.util.Scanner;

/**
 * 3번 최대매출
 * 복잡도 O(n), k개만큼 묶어서 합이 가장 큰 묶음의 값 출력
 */
public class _03_ {

//    public int solution(int n, int k, int[] arr) {
//        int answer = 0, tmp = 0, max = Integer.MIN_VALUE;
//        for (int i=0; i<n-3; i++) {
//            tmp = arr[i] + arr[i+1] + arr[i+2];
//            System.out.println("tmp : " + tmp + " max : " + max);
//            if (tmp>max) max = tmp;
//        }
//        return max;
//    }

    public int solution(int n, int k, int[] arr) {
        int answer, sum = 0;
        // i=0부터 i=k까지 sum 초기 값 세팅
        for (int i=0; i<k; i++) sum += arr[i];
        answer = sum;
        for (int i=k; i<n; i++) {
            // sum 값을 계속 업데이트 해주면서 이전 값이랑 비교해서 최댓값 계속 업데이트
            // i번째 arr 더하고, 첫번째 arr는 빼주는 로직
            sum += (arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        _03_ main = new _03_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, k, arr));
    }
}
