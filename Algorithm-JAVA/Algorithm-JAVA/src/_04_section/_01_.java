package _04_section;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 1번 학급 회장 (해쉬)
 * getOrDefault(k, v) : 대상 key에 대응하는 value가 없다면, value 0으로 만들어서 반환
 * containsKey(char) : char 라는 키가 맵에 있는지 없는지 boolean 반환
 * size() : 키의 갯수 반환
 * remove(char) : 특정 키 삭제
 *
 */
public class _01_ {

    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

//        System.out.println(map.containsKey('A'));
//        System.out.println(map.size());
//        System.out.println(map.remove('A'));

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key)>max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _01_ main = new _01_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(main.solution(n, s));
    }
}
