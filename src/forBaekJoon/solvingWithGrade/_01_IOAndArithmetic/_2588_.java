package forBaekJoon.solvingWithGrade._01_IOAndArithmetic;

import java.util.Scanner;

public class _2588_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        int a = (j % 10) * i;
        int b = ((j / 10) % 10) * i;
        int c = (j / 100) * i;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(i * j);



    }
}
