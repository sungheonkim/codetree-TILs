import java.util.Scanner;
public class Main {
    public static int MAXSIZE=100000;
    public static int[] posA=new int[MAXSIZE+1];
    public static int[] posB=new int[MAXSIZE+1];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt=0;
       
        int timeA=1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while(t-->0){
                posA[timeA]=posA[timeA-1]+v;
                timeA++;
            }
        }

        int timeB=1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while(t-->0){
                posB[timeB]=posB[timeB-1]+v;
                timeB++;
            }
        }
        //A가 선두면 1, B가 선두면 2
        int fast=0;

        for(int i=1;i<timeA;i++){
            //A가 B보다 더 커졌고, A가 선두가 아니였다면
            if(posA[i]>posB[i]&&fast!=1){
                fast=1;
                cnt++;
            }
            else if(posA[i]<posB[i]&&fast!=2){
                fast=2;
                cnt++;
            }
            else if(posA[i]==posB[i]&&fast!=0){
                cnt++;
                fast=0;
            }
        }
        
        System.out.print(cnt);
        // Please write your code here.
    }
}