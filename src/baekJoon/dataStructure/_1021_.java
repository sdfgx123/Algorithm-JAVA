package baekJoon.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 1021. 회전하는 큐
 * 첫째 줄에 큐의 크기 N과 뽑아내려고 하는 수의 개수 M 입력
 * 둘째 줄에는 뽑아내려고 하는 수의 위치 순서대로 입력
 *
 *
 */
public class _1021_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> dequeue = new LinkedList<>();
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i=1; i<=n; i++) {
            dequeue.offer(i);
        }

        int[] seq = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<m; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<m; i++) {
            int targetIdx = dequeue.indexOf(seq[i]);
            int halfIdx;

            if (dequeue.size() % 2 == 0) {
                halfIdx = dequeue.size() / 2 - 1;
            }
            else {
                halfIdx = dequeue.size() / 2;
            }

            if (targetIdx <= halfIdx) {
                for (int j=0; j<targetIdx; j++) {
                    int tmp = dequeue.pollFirst();
                    dequeue.offerLast(tmp);
                    cnt++;
                }
            }
            else {
                for (int j=targetIdx; j<dequeue.size(); j++) {
                    int tmp = dequeue.pollLast();
                    dequeue.offerFirst(tmp);
                    cnt++;
                }
            }

            dequeue.pollFirst();
        }

        System.out.println(cnt);
    }
}
