package _02_section;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * section 2번 / 배열로 int 받아서 앞에 있는 수 중 큰 수 출력하는 알고리즘
 */
public class _01_PrintMax {

    public ArrayList<Integer> solution(int n, int[] arr) {

        // arrayList 선언
        ArrayList<Integer> ans = new ArrayList<>();
        // 0번 인덱스 먼저 넣어주는 이유 : 앞의 숫자랑 비교해야 하기 때문에
        ans.add(arr[0]);
        // i = 1부터 출발하는 이유 : 앞의 인덱스랑 비교해야 하는데 0번 인덱스는 앞의 숫자가 없기 때문에
        for (int i = 1; i < n; i++) {
            // 앞의 숫자 i-1과 비교해서, i번째가 더 크면 ans에 i번째 인덱스 add
            if (arr[i] > arr[i-1]) ans.add(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {

        _01_PrintMax main = new _01_PrintMax();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // for문 돌려서 int arr 인덱스 하나씩 채워줌
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // forEach 돌려서 solution 함수 arrayList로 받아온 다음 인덱스 하니씩 뿌려줌
        for (int x : main.solution(n, arr)) {
            System.out.println(x + " ");
        }
    }
}
