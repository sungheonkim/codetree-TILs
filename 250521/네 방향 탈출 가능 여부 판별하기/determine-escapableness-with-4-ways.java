import java.util.*;

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static final int MAX_NUM = 100;
    public static int n, m;
    public static int[][] a = new int[MAX_NUM][MAX_NUM];
    public static boolean[][] visited = new boolean[MAX_NUM][MAX_NUM]; // Fixed typo: 'booleanp' -> 'boolean'
    public static Queue<Pair> q = new LinkedList<>();

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
    
    public static boolean canGo(int x, int y) {
        return inRange(x, y) && a[x][y] == 1 && !visited[x][y];
    }

    public static void BFS() {
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int x = curr.x;
            int y = curr.y;

            int[] dx = new int[]{1, -1, 0, 0};
            int[] dy = new int[]{0, 0, 1, -1}; // Fixed: removed dot after 0

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i]; // Fixed: was using dy[i] instead of dx[i]
                int newY = y + dy[i];

                if (canGo(newX, newY)) {
                    q.add(new Pair(newX, newY));
                    visited[newX][newY] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
                
        // Add starting point to queue
        q.add(new Pair(0, 0));
        visited[0][0] = true;

        BFS();

        int answer = visited[n-1][m-1] ? 1 : 0;
        System.out.println(answer);
    }
}