import java.util.Scanner;
public class Main {
    public static final int MAX_N=100;
    public static final int MAX_R=2000;
    public static final int OFFSET=200;

    public static int[] x1=new int[MAX_N];
    public static int[] y1=new int[MAX_N];
    public static int[] x2=new int[MAX_N];
    public static int[] y2=new int[MAX_N];

    public static int[][] checked =new int[MAX_R+1][MAX_R+1]; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // 입력
        for(int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            // OFFSET을 더해줍니다.
            x1[i] += OFFSET;
            y1[i] += OFFSET;
   
        }
    
        for(int i = 0; i < n; i++)
            for(int x = x1[i]; x <x1[i]+8; x++)
                for(int y = y1[i]; y <y1[i]+8; y++)
                    checked[x][y]= 1;
        
        int area=0;
        // Please write your code here.
        for(int x=0;x<=MAX_R;x++){
            for(int y=0;y<=MAX_R;y++){
                if(checked[x][y]==1)
                area++;
            }
        }
        System.out.println(area);
    }
}