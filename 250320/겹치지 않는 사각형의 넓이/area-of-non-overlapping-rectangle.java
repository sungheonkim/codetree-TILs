import java.util.Scanner;
public class Main {
    public static final int N=3;
    public static final int MAX_R=2000;
    public static final int OFFSET=1000;

    public static int[] x1=new int[N];
    public static int[] y1=new int[N];
    public static int[] x2=new int[N];
    public static int[] y2=new int[N];

    public static int[][] checked =new int[MAX_R+1][MAX_R+1]; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        for(int i = 0; i < N; i++) {
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
        
        // 직사각형에 주어진 순으로 1, 2, 3 번호를 붙여줍니다.
        // 격자 단위로 진행하는 문제이므로
        // x2, y2에 등호가 들어가지 않음에 유의합니다.
        for(int i = 0; i < N; i++)
            for(int x = x1[i]; x < x2[i]; x++)
                for(int y = y1[i]; y < y2[i]; y++)
                    checked[x][y]= i + 1;
        
        int area=0;
        // Please write your code here.
        for(int x=0;x<=MAX_R;x++){
            for(int y=0;y<=MAX_R;y++){
                if(checked[x][y]==1||checked[x][y]==2)
                area++;
            }
        }
        System.out.println(area);
    }
}