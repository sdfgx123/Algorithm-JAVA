package forBaekJoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class _2750_ {
    public static void main(String[] args) throws IOException {

        /**
         * 카운팅 정렬 + BufferedReader + StringBuilder
         * 카운팅 정렬
         * 가장 작은 데이터부터 가장 큰 데이터까지의 범위가 모두 담길 수 있는 리스트를 생성
         * 데이터를 하나씩 확인하며 데이터의 값과 동일한 인덱스의 데이터를 1씩 증가
         * 증가된 리스트에서 0인 값을 제외하고, 인덱스를 인덱스 값만큼 출력
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2001];

        for (int i=0; i<n; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        for (int i=0; i<2001; i++) {
            if (arr[i]) {
                sb.append(i-1000).append('\n');
            }
        }

        System.out.println(sb);

        /**
         * Arrays.sort
         */
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//
//        for (int i=0; i<n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//        Arrays.sort(arr);
//
//        for (int val : arr) {
//            sb.append(val).append('\n');
//        }
//
//        System.out.println(sb);
    }
}
