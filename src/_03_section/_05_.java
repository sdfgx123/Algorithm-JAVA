package _03_section;

import java.util.Scanner;

/**
 * 5번 : 연속된 자연수의 합
 */
public class _05_ {

//    public int solution(int n) {
//        int answer = 0, lt = 0, sum = 0;
//        for (int rt=0; rt<n; rt++) {
//            sum += rt;
//            if (sum==n) answer++;
//            else if (sum>n) {
//                lt++;
//                sum -= lt;
//                if (sum==n) answer++;
//            }
//        }
//        return answer;
//    }

    public int solution(int n) {
        int answer = 0, sum = 0;
        // m을 n/2+1로 초기화한 이유는 2개 이상이라는 조건 때문인 것 같음.
        int m = n/2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;
        int lt = 0;
        for (int rt=0; rt<m; rt++) {
            sum += arr[rt];
            if (sum==n) answer++;
            while (sum>=n) {
                sum -= arr[lt++];
                if (sum==n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _05_ main = new _05_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.solution(n));

    }
}
