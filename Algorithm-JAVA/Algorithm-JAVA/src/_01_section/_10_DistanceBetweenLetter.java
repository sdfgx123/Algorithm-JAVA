package _01_section;

import java.util.Scanner;

public class _10_DistanceBetweenLetter {

    public int[] solution(String s, char t) {
        int [] res = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                res[i] = p;
            }
            else {
                p++;
                res[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
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

        String s = sc.next();
        char t = sc.next().charAt(0);

        for (int x : main.solution(s, t)) {
            System.out.println(x + " ");
        }

    }
}
