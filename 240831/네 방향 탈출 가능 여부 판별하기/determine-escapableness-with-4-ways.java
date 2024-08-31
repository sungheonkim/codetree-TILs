import java.util.*;
public class Main {
   
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int answer=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        boolean[][] visited=new boolean[a][b];

        int[][] map=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                map[i][j]=sc.nextInt();
            }
        }

        int[] nr={1,-1,0,0};
        int[] nc={0,0,1,-1};

        Queue<int[]> q= new LinkedList<>();
        visited[0][0]=true;
        q.add(new int[]{0,0});

        while(!q.isEmpty()){
            int[] curr=q.poll();
            int currRow=curr[0];
            int currCol=curr[1];

            if(currRow==a-1&&currCol==b-1){
                answer=1;
            }
            for(int i=0;i<4;i++){
                int nextRow=currRow+nr[i];
                int nextCol=currCol+nc[i];

                if(nextRow>=0&&nextRow<a&&nextCol>=0&&nextCol<b&&map[nextRow][nextCol]==1
                &&!visited[nextRow][nextCol]){
                    visited[nextRow][nextCol]=true;
                    q.add(new int[]{nextRow,nextCol});
                }
            }

        }
        System.out.println(answer);
    }
}