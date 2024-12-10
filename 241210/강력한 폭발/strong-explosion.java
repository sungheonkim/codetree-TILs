import java.util.*;

class Pair{
    int x,y;
    public Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}

//1.visit 배열로 검사했던 곳 패스하기
public class Main {
    public static final int BOMB_TYPE_NUM=3;
    public static final int MAX_N=20;

    public static int n;
    public static int[][] bombType =new int[MAX_N][MAX_N];
    public static boolean[][] visited=new boolean[MAX_N][MAX_N];

    public static int ans;

    public static List<Pair> bombPos=new ArrayList<>();

    public static boolean inRange(int x,int y){
        return 0<=x && x<n && 0<=y &&y<n;
    }

    public static void bomb(int x,int y,int bType){
        //폭탄 터질 위치 정해주기
        Pair[][] bombShapes={
            {},
            {new Pair(-2,0),new Pair(-1,0),new Pair(2,0),new Pair(1,0),new Pair(0,0)},
            {new Pair(-1,0),new Pair(1,0),new Pair(0,-1),new Pair(0,1),new Pair(0,0)},
            {new Pair(-1,1),new Pair(-1,-1),new Pair(1,1),new Pair(1,-1),new Pair(0,0)}
        };
        //격자 내 칸에 대해 dx,dy 탐색
        for(int i=0;i<5;i++){
            int dx=bombShapes[bType][i].x;
            int dy=bombShapes[bType][i].y;

            int nx=x+dx, ny=y+dy;

            if(inRange(nx,ny)){
                visited[nx][ny]=true;
            }
        }
    }

    public static int calc(){
        //1.방문배열 초기화
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                visited[i][j]=false;
            }
        }
        //2. 방문여부 체크
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(bombType[i][j]>0) bomb(i,j,bombType[i][j]);
            }
        }
        int cnt=0;
        //3.cnt ㄱㄱ
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]) cnt++;
            }
        }
        return cnt;
    }

    public static void findMaxArea(int cnt){
        if(cnt==(int)bombPos.size()){
            ans=Math.max(ans,calc());
            return;
        }
        for(int i=1;i<=3;i++){
            int x=bombPos.get(cnt).x;
            int y=bombPos.get(cnt).y;

            bombType[x][y]=i;
            findMaxArea(cnt+1);
            bombType[x][y]=0;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int bombPlace=sc.nextInt();
                if(bombPlace>0){
                    bombPos.add(new Pair(i,j));
                }
            }
        }

        findMaxArea(0);

        System.out.print(ans);

    }
}