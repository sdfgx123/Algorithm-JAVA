package _05_section;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 응급실
 */
class Person {
    int id, priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class _08_ {

//    public int solution(int n, int m, int[] arr) {
//        int answer = 0;
//        Queue<Integer> Q = new LinkedList<>();
//        for (int i=0; i<n; i++) Q.offer(arr[i]);
//        if ()
//    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i=0; i<n; i++) {
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            for (Person x : Q) {
                // if 걸리면 > tmp보다 우선순위 높은 게 존재한다는 뜻
                if (x.priority>tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            // tmp가 우선순위가 제일 높다면
            if (tmp!=null) {
                answer++;
                if (tmp.id == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _08_ main = new _08_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, m, arr));
    }
}
