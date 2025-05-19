import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public static int[][] grid;

    //주어진 k에 대한 마름모 넓이
    public static int getArea(int k){
        return k*k+(k+1)*(k+1);
    }

    //주어진 k에 대한 채굴 가능한 금의 갯수
    public static int getNumOfGold(int row,int col,int k){
        int numOfGold=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(row-i)+Math.abs(col-j)<=k) numOfGold+=grid[i][j];
    
            }
        }
        return numOfGold;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxGold=0;
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                for(int k=0;k<=2*(n-1);k++){
                   int numOfGold=getNumOfGold(row,col,k);

                   if(numOfGold*m>=getArea(k)) maxGold=Math.max(maxGold,numOfGold);
                }
            }
        }
        System.out.print(maxGold);
    }
}