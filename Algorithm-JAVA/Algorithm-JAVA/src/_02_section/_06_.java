package _02_section;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수
 * 숫자 받은 후에
 * 1) 숫자 뒤집고 2) 소수이면
 * 두 개의 조건 만족하면 출력하는 문제
 */
public class _06_ {

    // 이 함수에서 뒤집은 수가 소수인지 판별
    public boolean isPrime(int num) {
        // 넘어온 숫자가 1 이라면 > 소수가 아님 > return false
        if (num==1) return false;
        // 2부터 num 바로 전 숫자까지 나눠 떨어지는 수가 있다면 > 소수 아님 > false
        for (int i=2; i<num; i++) {
            if (num%i==0) return false;
        }
        return true;
    }

    /**
     * 여기서 숫자 뒤집은 다음, isPrime 함수로 소수 여부 판단하고
     * 소수인 숫자들을 ArrayList로 반환
     */
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int tmp = arr[i];
            // res : 뒤집기 세팅 끝난 숫자 > isPrime(int num)에 넘겨서 소수인지 확인하는 작업 거치게 됨
            int res = 0;
            while (tmp>0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) ans.add(res);
        }
        return ans;
    }

    public static void main(String[] args) {
        _06_ main = new _06_();
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
