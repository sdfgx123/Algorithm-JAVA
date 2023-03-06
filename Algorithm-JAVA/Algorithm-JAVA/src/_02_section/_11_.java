package _02_section;

import java.util.Scanner;

/**
 * 11번 : 임시반장 정하기
 */
public class _11_ {

//    public int solution(int n, int[][] arr) {
//        int answer;
//        int[] cnt = new int[n];
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                if (arr[])
//            }
//        }
//        return 0;
//    }

    /**
     * 이해가 안되는 부분
     * i, j, k 다 1부터 시작인데
     * 첫번째 if 에서 비교할 때,
     * arr[1][1]==arr[1][1] 비교하는 거 아님?
     */
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i=1; i<=n; i++) {
            int cnt = 0;
            for (int j=1; j<=n; j++) {
                for (int k=1; k<=5; k++) {
                    /**
                     * 먼저, (i, j)로 같은 반 이었는지 비교하기 위한 학생 간 짝을 설정함
                     * 그리고, k=1부터 k=5까지 돌면서 같은 반 이었는지 확인함
                     * 만약, 같은 반 된 적 있어서 걸렸다면 cnt++하고 break 함
                     * 왜냐하면, 이미 같은 반인 게 확인됐는데 중복해서 카운팅 하면 안되기 때문임.
                     */
                    if (arr[i][k]==arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            /**
             * 카운팅 다 해준 뒤, cnt와 최댓값 비교해서 cnt가 max보다 크다면
             * answer를 학생 번호인 i로 초기화 해줌.
             * 그 뒤 다시 i for문 돌면서 cnt=0 초기화 해주고
             * 학생 짝 찾아서 cnt 카운팅 하고 다시 max 초기화
             *
             * ** j for문에서 cnt, max 비교하지 않는 이유
             * 주인공이 i임 > i와 나머지 학생"들"의 짝을 만들고 비교하는 것이기 때문에 j가 바껴도 계속 카운팅을 해줘야 하기 때문임.
             */
            if (cnt>max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _11_ main = new _11_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 왜 arr 배열 범위를 n+1, 6으로 잡는지 이해 안됨 > 카운팅을 i=1부터 하니까, 인덱스가 n+1만큼 필요함 > 왜냐하면, i=0부터 시작이면 n-1까지만 카운팅 하기 때문에
        // i=1부터 카운팅 하려면 n까지 세어 줘야 하기 때문에 인덱스를 n+1까지 잡아줘야 하는 거임.
        // 같은 맥락으로, 6도 n+1까지 카운팅 하려면 이렇게 세팅해야 함 > 이때, 학년이 5학년으로 고정되기 때문에 6으로 인덱스를 확정해서 선언할 수 있는 거임.
        int[][] arr = new int[n+1][6];
        for (int i=1; i<=n; i++) {
            // j for문 왜 5까지 잡는지 이해 안됨
            for (int j=1; j<=5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
