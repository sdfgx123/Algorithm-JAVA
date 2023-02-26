package _02_section;

import java.util.Scanner;

/**
 * 7번 점수계산
 * 첫째줄 문제 개수, 둘째줄 n개의 문제 채점 결과 0 또는 1
 * 1이 연속될 경우, 연속된 횟수만큼 점수 누적, 예 : 1,1 > 2점
 * 가산점 고려한 채점 결과, 즉 총 점수 출력
 */
public class _07_ {
    public int solution(int n, int[] arr) {
//        int ans;
//        int[] score = new int[n];
//        for (int i=0; i<n; i++) {
//            if (arr[i]==1) {
//                int cnt = 0;
//                while (true) {
//                    if (arr[i]==1) cnt++;
//                    else break;
//                }
//
//            }
//        }
        // cnt : 가산점 카운팅할 변수, sum : 총 점수
        int cnt = 0, sum = 0;
        for (int i=0; i<n; i++) {
            if (arr[i]==1) {
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        _07_ main = new _07_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, arr));
    }
}
