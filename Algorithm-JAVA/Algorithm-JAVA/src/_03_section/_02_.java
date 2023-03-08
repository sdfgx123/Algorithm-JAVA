package _03_section;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 공통원소 구하기
 * 1) 오름차순으로 정렬해야 하고, 2) 두 array 간 비교 전 각 arr는 정렬 완료돼 있어야 함
 */
public class _02_ {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while (p1<n && p2<m) {
            if (a[p1]==b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }
            else if (a[p1]<b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        _02_ main = new _02_();
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
