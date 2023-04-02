package _04_section;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 3번 : 매출액의 종류
 */
public class _03_ {

//    public ArrayList<Integer> solution(int n, int k, int[] arr) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<k; j++) {
//                map.put(arr[j], )
//            }
//        }
//    }

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int lt = 0;
        /**
         * 이 for문 답에서는 int rt=k-1부터 인데, int rt=n-k로 잡아도 가능하지 않음?
         * 같은 맥락으로, 첫번째 for문에서도 i<k-1을 i<n-k로 바꿀 수 있지 않나?
         */
        for (int rt=k-1; rt<n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);
            if (map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        _03_ main = new _03_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : main.solution(n, k, arr)) System.out.println(x + " ");
    }
}
