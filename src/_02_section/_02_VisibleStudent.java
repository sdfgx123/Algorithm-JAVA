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

    /**
     * 2번 문제 : 보이는 학생
     * 학생들을 일렬로 세우고, 키에 따라 앞에서 봤을 때 몇명이나 보이는지
     * 계산하는 알고리즘
     * [입력예제]
     * 8
     * 130 135 148 140 145 150 150 153
     * [출력 예제]
     * 5
     */
    public int solution(int n, int[] arr) {
        // cnt 변수 1로 초기화, 맨 앞은 무조건 카운트 되니까, 최댓값 담고 계속 비교할 max 변수 초기화
        int cnt = 1, max = arr[0];
        for (int i = 0; i < n; i++) {
            // 만약 arr i번째가 max보다 크다면 > 즉, 뒷사람이 앞에서 가장 큰 사람보다 크다면
            if (arr[i] > max) {
                // arr[i]를 최댓값 max로 다시 초기화
                max = arr[i];
                // 보이는 사람 한 명 추가 됐으니까 cnt++
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
        // for문 돌려서 배열 채움
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(main.solution(n, arr));
    }
}
