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
        //선구 구해주기 
        int leader=0,cnt=0;

        for(int i=1;i<timeA;i++){
            if(posA[i]>posB[i]){
                if(leader==2){
                    cnt++;
                }
                leader=1;
            }
            if(posA[i]<posB[i]){
                if(leader==1){
                    cnt++;
                }
                leader=2;
            }
        }
        System.out.println(cnt);
        // Please write your code here.
    }
}