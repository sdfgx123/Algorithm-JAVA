package baekJoon.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * 18258. 큐 2
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램 작성
 */
public class _18258_ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            String[] parts = str.split(" ");
            String order = parts[0];

            if (order.equals("push")) queue.offer(Integer.parseInt(parts[1]));
            if (order.equals("front")) {
                if (! isEmpty(queue, sb)) sb.append(queue.getFirst() + "\n");
            }
            if (order.equals("back")) {
                if (! isEmpty(queue, sb)) sb.append(queue.getLast() + "\n");
            }
            if (order.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1 + "\n");
                }
                else {
                    sb.append(0 + "\n");
                }
            }
            if (order.equals("pop")) {
                if (! isEmpty(queue, sb)) sb.append(queue.pop() + "\n");
            }
            if (order.equals("size")) {
                sb.append(queue.size() + "\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isEmpty(LinkedList<Integer> queue, StringBuilder sb) {
        if (queue.isEmpty()) {
            sb.append(-1 + "\n");
            return true;
        }
        return false;
    }
}
