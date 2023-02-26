package _02_section;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 8번 등수 구하기
 * 첫 줄에 n 입력, 두 번째 줄에 점수 의미하는 n개의 정수 입력
 * 입력된 순서대로 등수 출력
 */
public class _08_ {

    // 해설에선 int[]로 반환했는데, 여기선 arrayList 씀
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0; i<n; i++) {
            /**
             * cnt : 등수 입력할 변수
             * j=0부터 탐색해서, arr[j]가 arr[i]보다 더 크면,
             * 즉 더 높은 점수가 나타나면 cnt++ 해서 등수가 밀려남
             */
            int cnt = 1;
            for (int j=0; j<n; j++) {
                if (arr[j]>arr[i]) cnt++;
            }
            res.add(cnt);
        }
        return res;
    }

    public static void main(String[] args) {
        _08_ main = new _08_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : main.solution(n, arr)) {
            System.out.println(x + " ");
        }
    }
}
