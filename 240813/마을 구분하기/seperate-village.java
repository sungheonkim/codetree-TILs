import java.util.*;

public class Main {
    static boolean[][] visited;
    static int personCnt = 0;
    static int n; // 전역으로 n을 선언
    static int[][] maps; // 전역으로 maps를 선언

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        maps = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maps[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (maps[i][j] == 1 && !visited[i][j]) {
                    personCnt = 1; // 각 새로운 그룹이 발견될 때마다 personCnt 초기화
                    visited[i][j] = true;
                    dfs(i, j);
                    result.add(personCnt);
                }
            }
        }
        Collections.sort(result);

        System.out.println(result.size());
        for (int num : result) {
            System.out.println(num);
        }
    }

    public static void dfs(int x, int y) {
        int[] nr = {1, -1, 0, 0};
        int[] nc = {0, 0, 1, -1};

        for (int i = 0; i < 4; i++) {
            int nextR = x + nr[i];
            int nextC = y + nc[i];

            if (nextR >= 0 && nextR < n && nextC >= 0 && nextC < n 
                && !visited[nextR][nextC] && maps[nextR][nextC] == 1) {
                visited[nextR][nextC] = true;
                personCnt++;
                dfs(nextR, nextC);
            }
        }
    }
}