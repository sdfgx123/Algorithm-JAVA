package baekJoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 1427. 소트인사이드 S5
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 * 첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 * 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 */
public class _1427_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

//        String str = br.readLine();
//        Integer[] arr = new Integer[str.length()];
//
//        for (int i=0; i<str.length(); i++) {
//            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
//        }
//
//        Arrays.sort(arr, Comparator.reverseOrder());
//
//        for (int i=0; i<str.length(); i++) {
//            sb.append(arr[i]);
//        }

        // 카운팅 정렬 사용해서 푸는 방법
        String str = br.readLine();
        int[] cnt = new int[10];

        for (int i=0; i<str.length(); i++) {
            cnt[str.charAt(i) - '0']++;
        }

        for (int j=9; j>=0; j--) {
            while (cnt[j]-- > 0) {
                sb.append(j);
            }
        }

        System.out.println(sb);
    }
}
