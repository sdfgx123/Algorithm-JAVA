package _02_section;

import java.util.Scanner;

/**
 * 에라토스테네스의 체
 * 자연수 n 입력 > 1부터 n까지의 소수의 개수 출력
 * 입력 예 : 20, 출력 예 : 8
 * ch[]의 사용 목적 : _________ 이렇게 ch 배열이 있으면,
 * 기본적으로 배열은 0으로 세팅되는데, 이게 소수라는 의미임.
 * 인덱스별 배열의 값 초기화 해주지 않으면 요소는 전부 0으로 default 초기화 된다는 뜻임
 * i=2에서 0 걸렸으니까, 2의 배수들은 모조리 0 > 1로 바뀜
 * 따라서, 1은 소수가 아닌 것으로 거를 수 있음.
 */
public class _05_Eratos {

    public int solution(int n) {
        int cnt = 0;
        // 체크 배열 생성
        int[] ch = new int[n+1];
        for (int i=2; i<=n; i++) {
            // ch[i]==0이면 소수임
            if (ch[i] == 0) {
                cnt++;
                /**
                 * i부터 i의 배수들을 다 체크해주는 작업
                 * 예를 들어, 7에서 소수 걸려서 cnt++ 해주고
                 * 7, 14, 21, ... 이렇게 다 카운팅 해줘야
                 * 다음 숫자들은 7의 배수로서 소수로 카운팅 되지 않음
                 */
                for (int j=i; j<=n; j=j+i) ch[j] = 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        _05_Eratos main = new _05_Eratos();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(main.solution(n));
    }
}
