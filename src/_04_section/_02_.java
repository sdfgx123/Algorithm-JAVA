package _04_section;

import _03_section._04_;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 2번 아나그램(해쉬)
 */
public class _02_ {

//    public String solution(String s1, String s2) {
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//        for (char x : s1.toCharArray()) {
//            map1.put(x, map1.getOrDefault(x, 0)+1);
//        }
//        for (char y : s2.toCharArray()) {
//            map1.put(y, map2.getOrDefault(y, 0)+1);
//        }
//        System.out.println("map1 : " + map1);
//        System.out.println("map2 : " + map2);
//        if (map1==map2) return "YES";
//        else return "NO";
//    }

    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x)-1);
        }
        // 결국, 걸리는 것 없이 테스트를 다 통과하면 YES 그대로 출력한다 이거임.
        return answer;
    }

    public static void main(String[] args) {
        _02_ main = new _02_();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(main.solution(s1, s2));
    }
}
