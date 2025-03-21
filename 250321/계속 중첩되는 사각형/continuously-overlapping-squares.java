import java.util.Scanner;
public class Main {
    public static int OFFSET=1000;
    public static int MAX_R=2000;
    public static int[][] check=new int[MAX_R+1][MAX_R+1];

    public static int[] x1;
    public static int[] y1;
    public static int[] x2;
    public static int[] y2; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x1=new int[n];
        x2=new int[n];
        y1=new int[n];
        y2=new int[n];
         
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
            x1[i]+=OFFSET;
            x2[i]+=OFFSET;
            y1[i]+=OFFSET;
            y2[i]+=OFFSET;

        }
        //빨간색이면 1 파란색이면 2
        int color=0;

        for(int i=0;i<n;i++){
            if(i%2==0) color=1;
            else color=2;

            for(int x=x1[i];x<x2[i];x++){
                for(int y=y1[i];y<y2[i];y++){
                    check[x][y]=color;
                }
            }
        }

        int area=0;
        for(int x=0;x<=MAX_R;x++){
            for(int y=0;y<=MAX_R;y++){
                if(check[x][y]==2)
                area++;
            }
        }
        System.out.println(area);

        // Please write your code here.
    }
}