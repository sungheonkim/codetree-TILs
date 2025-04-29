import java.util.Scanner;
public class Main {
    public static final int MAX_NUM=100;
    public static final int DIR_NUM=4;

    public static int n,m;
    public static int[][] arr=new int[MAX_NUM][MAX_NUM];

    public static int[] dx=new int[]{0,1,0,-1};
    public static int[] dy=new int[]{1,0,-1,0};

    public static int currX=0, currY=0;
    public static int dir=0;

    public static boolean inRange(int x,int y){
        return 0<=x && x<n && 0<=y && y < m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // 처음 위치 초기값.
        arr[currX][currY]=1;
        for(int i=2;i<=n*m;i++){
            int nextX=currX+dx[dir],nextY=currY+dy[dir];
            //나아갈 수 없으면 시계방향 90회전
            if(!inRange(nextX,nextY)||arr[nextX][nextY]!=0){
                dir=(dir+1)%4;
            }
            // 이동 후 채우기
            currX=currX+dx[dir];
            currY=currY+dy[dir];
            arr[currX][currY]=i;
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}