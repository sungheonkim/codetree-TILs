import java.util.*;

public class Main {
    public static final int MAX_N=10;

    public static int n;
    public static int[][] grid=new int[MAX_N][MAX_N];
    public static boolean[] visited=new boolean[MAX_N];
    public static List<Integer> picked=new ArrayList<>();

     public static int ans = 0;
     
    public static void backtrack(int row){
        if(row==n){
            int sum=0;
            for(int i=0;i<picked.size();i++){
                sum+=grid[i][picked.get(i)];
            }
            ans=Math.max(ans,sum);
            return;
        }

        for(int i=0;i<n;i++){
            if(visited[i]) continue;

            visited[i]=true;
            picked.add(i);

            backtrack(row+1);

            visited[i]=false;
            picked.remove(picked.size()-1);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        } 
        backtrack(0);
        System.out.print(ans);

    }
}