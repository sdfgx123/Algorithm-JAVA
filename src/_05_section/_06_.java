package _05_section;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * 공주 구하기(Queue 활용)
 */
public class _06_ {

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        // 큐 초기화
        for (int i=1; i<=n; i++) Q.offer(i);
        // 큐가 비어있지 않을 때까지 반복
        while (!Q.isEmpty()) {
            // k 바로 전 index까지 poll 한 다음 offer 해줌
            for (int i=1; i<k; i++) Q.offer(Q.poll());
            // k번째 index는 poll 해서 빼줌
            Q.poll();
            // 큐 사이즈 체크 > 큐에 하나만 남아있으면, poll 한 다음 바로 answer 초기화
            if (Q.size()==1) answer = Q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        _06_ main = new _06_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(main.solution(n, k));
    }
}
