package _04_section;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 4번 : 모든 아나그램 찾기(해시, 투포인터, 슬라이딩 윈도우)
 */
public class _04_ {

//    public int solution(String s1, String s2) {
//        int answer = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i=0; i<s2.length(); i++) {
//            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0)+1);
//        }
//        int lt = 0;
//        for (int i=0; i<s2.length()-1; i++) {
//            arr.add()
//        }
//        for (int rt=0; rt<s1.length(); rt++) {
//
//        }
//    }

    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
        for (int i=0; i<b.length()-1; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
        int lt = 0;
        for (int rt=b.length()-1; rt<a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
            if (am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if (am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        _04_ main = new _04_();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(main.solution(s1, s2));
    }
}
