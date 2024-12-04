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
        int cnt = 1;  // 1부터 시작
        for(int i = 0; i < n-1; i++) {
            if(grid[start][i] == grid[start][i+1]) {
                cnt++;
                if(cnt >= m) {  // m개 이상 연속되면
                    return 1;
                }
            } else {
                cnt = 1;  // 다른 수가 나오면 1로 초기화
            }
        }
        return 0;
}
    public static int isTrueCol(int m,int n,int start){
        int cnt=1;
        for(int i=0;i<n-1;i++){
            //종료조건
            if(cnt==m){
                return 1;
            }
            
            if(grid[i][start]==grid[i+1][start]) cnt++;
            else cnt=1;
        }

        if(cnt==m) return 1;
        else return 0;
    }
}