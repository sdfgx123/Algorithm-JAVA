package _01_section;

import java.util.Scanner;

public class _12_Encryption {

    public String solution(int n, String str) {
        String res = "";
        for (int i = 0; i < n; i++) {
            // substring(0, 7) : 0부터 6번 인덱스까지 뽑아낸다 : 왜냐하면 마지막 인덱스 7은 포함 안되니까 / substring 사용법 공부할 것
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            // 2진수를 10진수로 바꿔주는 라인
            // Integer.parseInt(String s, int radix) : 숫자형의 문자열을 첫번째 인자 값으로 받고, 변환할 진수값을 입력하면 해당 진수에 맞춰 Integer 형, 즉 10진수로 반환
            int num = Integer.parseInt(tmp, 2);
            res += (char) num;
            // 7번째 인덱스부터 시작하고, 나머지 앞에 있는 인덱스는 다 잘라낸다
            str = str.substring(7);
        }
        return res;
    }

    public static void main(String[] args) {

        _12_Encryption main = new _12_Encryption();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(main.solution(n, str));
    }
}
