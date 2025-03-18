import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int[] visit=new int[201];
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            a+=100;
            b+=100;

            for(int j=a;j<b;j++){
                visit[j]++;
            }
          
        }
        int max=0;

        for(int i=0;i<=200;i++){
            max=Math.max(max,visit[i]);
        }
        System.out.println(max);
        // Please write your code here.
    }
}