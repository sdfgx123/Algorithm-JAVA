package forBaekJoon.solvingWithGrade._01_IOAndArithmetic;

import java.util.Scanner;

public class _10926_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comparedTo = sc.next();
        String str = sc.next();
        if (str.length() > 50 || comparedTo.length() > 50) {
            System.exit(0);
        }
        if (str.equals(comparedTo)) {
            System.out.println(str + "??!");
        }
    }
}
