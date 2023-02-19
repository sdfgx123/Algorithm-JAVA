package _02_section;

import _01_section._02_CaseChanging;

import java.util.Scanner;

public class _02_VisibleStudent {

    /**
     * 처음에 단순히 앞의 값 하고만 비교해서 앞의 두 수가 클 경우
     * 이를 반영하지 못한다는 문제 발생
     * 따라서, max 최댓값을 arr[0]으로 초기화 해주고 하나씩 비교하는
     * 방식으로 해야 함
     */
    public int solution(int n, int[] arr) {
        int cnt = 1, max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        _02_VisibleStudent main = new _02_VisibleStudent();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(main.solution(n, arr));
    }
}
