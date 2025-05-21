import java.util.*;
class Pair{
    int x;
    int y;
    public Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Main {
    public static Queue<Pair> q=new LinkedList<>();
    public static int[] dx={1,-1,0,0};
    public static int[] dy={0,0,1,-1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer=0;
        
        int[][] grid = new int[n][n];
        boolean[][] visited = new boolean[n+1][n+1]; // 1부터 n까지 좌표 시스템
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        for(int i=0; i<k; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            q.add(new Pair(x, y));
            visited[x][y] = true;
        }
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int currX = curr.x;
            int currY = curr.y;

            for(int j=0; j<4; j++){
                int nextX = currX + dx[j];
                int nextY = currY + dy[j];

                // 좌표는 1부터 시작, grid는 0부터 시작
                if(nextX>=1 && nextY>=1 && nextX<=n && nextY<=n && 
                   grid[nextX-1][nextY-1]==0 && !visited[nextX][nextY]){
                    q.add(new Pair(nextX, nextY));
                    visited[nextX][nextY] = true;
                }
            }
        }

        for(int i=1; i<=n; i++){ // 1부터 n까지 카운트
            for(int j=1; j<=n; j++){
                if(visited[i][j]) answer++;
            }
        }
        System.out.println(answer);
    }
}