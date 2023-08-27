package forBaekJoon.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 10866. 덱
 * 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램 작성
 * ArrayDeque 사용하여 구현했지만, int[] 통해서도 구현해 볼 필요 있음.
 */
public class _10866_ {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            String[] parts = str.split(" ");
            String order = parts[0];
            if (parts.length > 1) {
                Integer num = Integer.parseInt(parts[1]);
                solve(order, num);
            }
            else {
                solve(order);
            }

        }

        System.out.println(sb);
    }

    public static void solve(String order) {
        if (order.equals("pop_front") && (! isEmpty())) {
            sb.append(deque.pollFirst() + "\n");
        }
        if (order.equals("pop_back") && (! isEmpty())) {
            sb.append(deque.pollLast() + "\n");
        }
        if (order.equals("size")) {
            sb.append(deque.size() + "\n");
        }
        if (order.equals("empty")) {
            if (deque.isEmpty()) {
                sb.append(1 + "\n");
            }
            else {
                sb.append(0 + "\n");
            }
        }
        if (order.equals("front") && (! isEmpty())) {
            sb.append(deque.getFirst() + "\n");
        }
        if (order.equals("back") && (! isEmpty())) {
            sb.append(deque.getLast() + "\n");
        }
    }

    public static void solve(String order, int num) {
        if (order.equals("push_front")) {
            deque.offerFirst(num);
        }
        if (order.equals("push_back")) {
            deque.offerLast(num);
        }
    }

    public static boolean isEmpty() {
        if (deque.isEmpty()) {
            sb.append(-1 + "\n");
            return true;
        }
        return false;
    }
}
