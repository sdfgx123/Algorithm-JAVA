package _03_section;

import java.util.Scanner;

/**
 * 4번 : 연속 부분수열
 */
public class _04_ {

    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;
        for (int rt=0; rt<n; rt++) {
            System.out.println("rt : " + rt);
            sum += arr[rt];
            if (sum==m) answer++;
            while (sum>=m) {
                System.out.println("sum : " + sum);
                sum -= arr[lt++];
                System.out.println("lt : " + lt);
                if (sum==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _04_ main = new _04_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, m, arr));
    }
}
