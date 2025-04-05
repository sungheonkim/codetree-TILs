import java.util.Scanner;

public class Main {
    public static int maxTime=1000000;
    public static int[] posA=new int[maxTime+1];
    public static int[] posB=new int[maxTime+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int timeA=1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            while(t>0){
                posA[timeA]=posA[timeA-1]+v;
                t--;
                timeA++;
            }
        }
        
        int timeB=1;
        for (int i = 0; i < m; i++) {
            int v=sc.nextInt();
            int t=sc.nextInt();
            while(t>0){
                posB[timeB]=posB[timeB-1]+v;
                t--;
                timeB++;
            }
        }
        int minTime=Math.min(timeA,timeB);
        //초기 선두 구해주기, 0이 A, 1이 B
        boolean fast=true;
        if(posA[1]>posB[1]) fast=false;
        else fast=true;
        
        int cnt=0; //선두 바뀐 횟수

        for(int i=2;i<=minTime;i++){
            if(fast==false){
                if(posA[i]<posB[i]){
                    cnt++;
                    fast=true;
                }
            }
            else{
                if(posA[i]>posB[i]){
                    cnt++;
                    fast=false;
                }
            }

        }
        System.out.println(cnt);
        // Please write your code here.
    }
}