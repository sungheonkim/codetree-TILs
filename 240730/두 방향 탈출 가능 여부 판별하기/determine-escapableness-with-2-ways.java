import java.util.*;
public class Main {
    public static int[][] grid;
    static int[] dx=new int[]{1,0};
    static int[] dy=new int[]{0,1};
    static boolean[][] vistied;
    static int answer=0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();
        grid=new int[r][c];
        vistied=new boolean[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                grid[i][j]=sc.nextInt();
            }
        }

        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(grid[i][j]);
        //     }
        //     System.out.println();

        // }

        dfs(0,0,grid);
        System.out.println(answer);


    }
    public static boolean isValid(int r,int c,int[][]grid){
        return (r>=0&&r<grid.length)&&(c>=0&&c<grid[0].length)&&(grid[r][c]==1);
    }

    public static void dfs(int r,int c,int[][] grid){

        vistied[r][c]=true;
        if(r==grid.length-1&&c==grid[0].length-1){
            answer=1;
            return;
        }
        for(int i=0;i<2;i++){
            int nextR=r+dx[i];
            int nextC=c+dy[i];

            if(isValid(nextR,nextC,grid)){
                if(!vistied[nextR][nextC])
                dfs(nextR,nextC,grid);
            }
        }
    }
}