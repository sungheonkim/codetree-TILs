import java.util.*;

public class Main {
    static int[][] grid;
    //2.3*3 격자에 얼마나 들어있나
    public static int getScore(int row,int col){
        int result=0;

        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                result+=grid[i][j];        
            }
        }
        return result;  
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        //1. grid 입력부터 받기
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        grid=new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }

        int maxScore=0;

        for(int row=0;row<n-2;row++)
            for(int col=0;col<n-2;col++){
                int score=getScore(row,col);

                maxScore=Math.max(score,maxScore);
            }
        System.out.println(maxScore);
    }
}