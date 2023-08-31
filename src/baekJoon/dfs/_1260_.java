package baekJoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 1260. DFS와 BFS
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성
 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료
 *
 * 입력 : 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V, 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호
 */
public class _1260_ {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i=0; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            graph[p].add(q);
            graph[q].add(p);
        }

        for (int i=1; i<=n; i++) {
            Collections.sort(graph[i]);
        }

        dfs(v);
        sb.append('\n');

        Arrays.fill(visited, false);
        bfs(v);

        System.out.println(sb);
    }

    public static void dfs(int v) {
        visited[v] = true;
        sb.append(v + " ");

        for (int nextV : graph[v]) {
            if (! visited[nextV]) dfs(nextV);
        }
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while (! queue.isEmpty()) {
            int currentV = queue.poll();
            sb.append(currentV + " ");

            for (int nextV : graph[currentV]) {
                if (! visited[nextV]) {
                    queue.add(nextV);
                    visited[nextV] = true;
                }
            }
        }
    }

}
