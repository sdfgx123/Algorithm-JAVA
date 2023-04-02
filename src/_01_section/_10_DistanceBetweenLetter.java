package _01_section;

import java.util.Scanner;

/**
 * 10번 : 가장 짧은 문자 거리
 * 한 개의 문자열 s와 t가 주어지면, 각 문자가 t로부터 떨어진 최소거리 출력
 * 입력 예 : teachermode e, 출력 예 : 1 0 1 2 1 0 1 2 2 1 0
 */
public class _10_DistanceBetweenLetter {

    public int[] solution(String s, char t) {
        // res 배열 선언 : 출력 결과가 담길 arr
        // res : int 타입의 배열 선언 > new로 메모리 할당 > int 배열인데, 배열의 길이는 s의 길이만큼으로 지정
        int [] res = new int[s.length()];
        // arr에 담길 실질 값, 즉 거리 > 일부러 큰 수인 1000으로 초기화 함
        int p = 1000;
        // 정방향 for문 부터 시작
        for (int i = 0; i < s.length(); i++) {
            // 만약 s의 값이 t와 같다면 > p(거리) = 0 으로 초기화 하고 res arr[i] p로 초기화
            if (s.charAt(i) == t) {
                p = 0;
                res[i] = p;
            }
            // 만약 다르다면 > p++ 하고, 왜냐하면 거리가 1씩 늘어나기 때문에 > res[i] p로 초기화
            else {
                p++;
                res[i] = p;
            }
        }

        // 역방향 시작 > p 다시 1000으로 초기화 해주고, 거꾸로 시작
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            // 정방향 실시할 때의 논리 구조와 같음
            if (s.charAt(i) == t) p = 0;
            // p++ > 정방향의 res[i]와 역방향의 p를 비교해서 최솟값으로 초기화 해야 함 > 왜냐하면 양방향 중 최솟값이 거리가 되니까
            else {
                p++;
                res[i] = Math.min(res[i], p);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        _10_DistanceBetweenLetter main = new _10_DistanceBetweenLetter();
        Scanner sc = new Scanner(System.in);

        // next() 메서드는 띄어쓰기를 기준으로 input 값을 구분함
        String s = sc.next();
        char t = sc.next().charAt(0);

        // forEach 호출하여 solution 리스트 하나씩 출력
        for (int x : main.solution(s, t)) {
            System.out.println(x + " ");
        }

    }
}
