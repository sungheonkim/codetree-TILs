import java.util.*;

public class Main {
    public static int n,m;
    public static int[][] map=new int[200][200];
    // 가능한 모든 모양을 전부 적어줍니다.
    public static int[][][] shapes = new int[][][]{
        {{1, 1, 0},
        {1, 0, 0},
        {0, 0, 0}},
    
        {{1, 1, 0},
        {0, 1, 0},
        {0, 0, 0}},
    
        {{1, 0, 0},
        {1, 1, 0},
        {0, 0, 0}},
    
        {{0, 1, 0},
        {1, 1, 0},
        {0, 0, 0}},
    
        {{1, 1, 1},
        {0, 0, 0},
        {0, 0, 0}},
    
        {{1, 0, 0},
        {1, 0, 0},
        {1, 0, 0}},
    };

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map[i][j]=sc.nextInt();
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans=Math.max(ans,getMaxSum(i,j));
            }
        }
        System.out.print(ans);

        
    }
    //블럭 모양 별
    public static int getMaxSum(int x,int y){
        int maxSum=0;

        for(int i=0;i<6;i++){
            boolean isPossible=true;
            int sum=0;

            for(int dx=0;dx<3;dx++){
                for(int dy=0;dy<3;dy++){
                    if(shapes[i][dx][dy]==0) continue;
                    if(x+dx>=n||y+dy>=m) isPossible=false;
                    else sum+=map[x+dx][y+dy];
                }
            }
            if(isPossible){
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
    
}