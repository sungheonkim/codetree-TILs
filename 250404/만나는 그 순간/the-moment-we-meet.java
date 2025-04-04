import java.util.Scanner;


public class Main {
    public static final int MAX_TIME=1000000;
    public static int[] posA=new int[MAX_TIME+1];
    public static int[] posB=new int[MAX_TIME+1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        //A 시간별 위치 기록
        int timeA=1;
        for(int i=0;i<n;i++){
            char d=sc.next().charAt(0);
            int t=sc.nextInt();
            
            while(t-- > 0){
                if(d=='R'){
                    posA[timeA]=posA[timeA-1]+1;
                }
                else{
                    posA[timeA]=posA[timeA-1]-1;
                }
                timeA++;
            }
        }
        //B 시간별 위치 기록
        int timeB=1;
        for(int i=0;i<m;i++){
            char d=sc.next().charAt(0);
            int t=sc.nextInt();
            
            while(t-- > 0){
                if(d=='R'){
                    posB[timeB]=posB[timeB-1]+1;
                }
                else{
                    posB[timeB]=posB[timeB-1]-1;
                }
                timeB++;
            }
        }
        int minTime=Math.min(timeA,timeB);
        
        int ans=-1;

        for(int i=1;i<minTime;i++){
            if(posA[i]==posB[i]){
                ans=i;
                break;
            }
        }
        System.out.println(ans); 
        // Please write your code here.
    }
}