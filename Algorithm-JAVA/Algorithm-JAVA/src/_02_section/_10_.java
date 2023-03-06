package _02_section;

import java.util.Scanner;

/**
 * 10번 : 봉우리
 * 상하좌우보다 더 큰 숫자 카운트 해서 봉우리의 갯수 출력
 */
public class _10_ {
    /**
     * 필드 변수 세팅
     * dx, dy : 상하좌우로 숫자를 비교할 배열 / 순서 : 9시 > 12시 > 3시 > 6시 > 이거 해설의 dx, dy가 잘못됐음 > 9시부터 비교하려면 지금처럼 dy, dx 순서로 해줘야 함
     * 헷갈린 이유 : 이건 2차원 좌표의 관점이 아니라, 행렬의 관점에서 이해해야 함.
     * 1) 행렬에서, (i, j)는 각각 (행, 열) 관계이지만,
     * 2) 2차원 좌표에서 (x, y)는 각각 (가로, 세로) 관계이기 때문이다.
     * 즉, 행렬과 2차원 좌표에서 각 쌍의 방향은 반대이다. 이래서 헷갈린 거임.
     */
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                // 봉우리 여부를 판단할 flag boolean
                boolean flag = true;
                for (int k=0; k<4; k++) {
                    // nx와 ny 좌표 세팅 > arr[nx][ny] 만들어서 arr[i][j]와 비교하기 위해
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    /**
                     * 주의 : nx와 ny 조건이 반드시 앞에 와야 함
                     * arr 비교 조건이 앞에 있으면, index out of range exception 발생 > 인덱스 범위 밖의 arr 요소를 참조하려 하기 때문에
                     * if : 만약 봉우리 주위의 arr가 더 크다면 > flag false 초기화 > 즉, 봉우리가 아님
                     */
                    if (nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                // 만약 flag가 참이면 > answer 증분
                if (flag) answer++;
            }
        }
        return answer;
    }

//    public int solution(int n, int[][] arr) {
//        int cnt = 0;
//        for (int i=1; i<n-1; i++) {
//            for (int j=1; j<n-1; j++) {
//                if (arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j+1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j-1]) cnt++;
//            }
//        }
//        return cnt;
//    }

    public static void main(String[] args) {
        _10_ main = new _10_();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
