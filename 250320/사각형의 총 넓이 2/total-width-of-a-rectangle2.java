import java.util.Scanner;
public class Main {
    public static final int OFFSET=100;
    public static final int MAX_R=200;
    public static int[][] checked = new int[201][201];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
            // OFFSET을 더해줍니다.
            x1[i] += OFFSET;
            y1[i] += OFFSET;
            x2[i] += OFFSET;
            y2[i] += OFFSET;
        }
        for(int i=0;i<n;i++){
            for(int x=x1[i];x<x2[i];x++)
                for(int y=y1[i];y<y2[i];y++)
                    checked[x][y]=1;
        }
        int area=0;

        for(int x=0;x<=MAX_R;x++){
            for(int y=0;y<=MAX_R;y++){
                if(checked[x][y]>0)
                    area++;
            }
        }
        System.out.print(area);
        // Please write your code here.
    }
}