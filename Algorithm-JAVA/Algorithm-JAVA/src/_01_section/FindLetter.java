package _01_section;

import java.util.Scanner;

public class FindLetter {

    public int solution(String str, char key) {
        int res = 0;
        str = str.toUpperCase();
        key = Character.toUpperCase(key);
        for (char i : str.toCharArray()) {
            if (i == key) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        FindLetter main = new FindLetter();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char key = sc.next().charAt(0);
        System.out.println(main.solution(str, key));
    }
}
