import java.util.*;
public class Main {
    static int[][] grid;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int result=0; //해당하는 수열 갯수

        int n=sc.nextInt();
        int m=sc.nextInt();

        grid=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        //1.행 기준 수열
        for(int i=0;i<n;i++){
            result+=isTrueCol(m,n,i);
            result+=isTrueRow(m,n,i);
        }
        System.out.println(result);
    }
    //3.m개 연속 같은 수가 나오는지 판별
   public static int isTrueRow(int m, int n, int start) {
    if(m == 1) return 1;  // M이 1이면 무조건 1 반환
    
    int cnt = 1;
    for(int i = 0; i < n-1; i++) {
        if(grid[start][i] == grid[start][i+1]) {
            cnt++;
            if(cnt >= m) {
                return 1;
            }
        } else {
            cnt = 1;
        }
    }
    return 0;
}

public static int isTrueCol(int m, int n, int start) {
    if(m == 1) return 1;  // M이 1이면 무조건 1 반환
    
    int cnt = 1;
    for(int i = 0; i < n-1; i++) {
        if(grid[i][start] == grid[i+1][start]) {
            cnt++;
            if(cnt >= m) {
                return 1;
            }
        } else {
            cnt = 1;
        }
    }
    return 0;
}
}