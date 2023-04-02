package _03_section;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 두 배열 합치기
 * 같은 숫자가 나올 경우의 정렬은 고려하지 않음 > 같은 숫자가 나온 경우를 커버하는 게 생각나지 않음
 */
public class _01_ {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1<n && p2<m) {
            if (a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while (p1<n) answer.add(a[p1++]);
        while (p2<m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        _01_ main = new _01_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int j=0; j<m; j++) {
            b[j] = sc.nextInt();
        }
        //System.out.println(main.solution(n, m, a, b));
        for (int x : main.solution(n, m, a, b)) System.out.print(x + " ");
    }
}
