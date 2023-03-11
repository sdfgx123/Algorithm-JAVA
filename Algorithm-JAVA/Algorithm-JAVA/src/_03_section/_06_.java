package _03_section;

import java.util.Scanner;

/**
 * 6번 : 최대 길이 연속부분수열
 */
public class _06_ {

    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt=0; rt<n; rt++) {
            if (arr[rt]==0) cnt++;
            while (cnt>k) {
                if (arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return 0;
    }

    public static void main(String[] args) {
        _06_ main = new _06_();
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
