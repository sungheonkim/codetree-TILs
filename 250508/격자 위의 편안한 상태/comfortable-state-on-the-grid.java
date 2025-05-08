import java.util.Scanner;
public class Main {

    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static boolean[][] visited;
    public static int n, m;

    public static int com(int x, int y) {
        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            int currx = x + dx[i];
            int curry = y + dy[i];

            // 격자 범위 체크 (0부터 n-1까지)
            if (currx >= 0 && curry >= 0 && currx < n && curry < n) {
                if (visited[currx][curry]) cnt++;
            } 
        }
        if (cnt == 3) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n+1][n+1];

        for (int i = 0; i <m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x--;
            y--;
            visited[x][y] = true;
        
            int result = com(x, y);

            System.out.println(result);
        }
    }
}