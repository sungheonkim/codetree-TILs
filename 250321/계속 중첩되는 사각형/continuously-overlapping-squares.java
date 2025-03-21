import java.util.Scanner;
public class Main {
    public static int OFFSET=1000;
    public static int MAX_R=200;
    public static int[][] color=new int[MAX_R+1][MAX_R+1];

    public static int[] x1;
    public static int[] y1;
    public static int[] x2;
    public static int[] y2; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x1=new int[n];
        x1=new int[n];
         
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
        }
        // Please write your code here.
    }
}