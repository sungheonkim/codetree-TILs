import java.util.Scanner;
public class Main {
    public static int curr=0; // 현재 좌표
    public static int[] visit; // 구간 체크하는 용도
    public static int OFFSET=100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        visit=new int[OFFSET*2+1];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            

            if(dir=='R') right(x);
            if(dir=='L') left(x);
            // Please write your code here.
        }
        int cnt=0;
        for(int i=0;i<OFFSET*2+1;i++){
            if(visit[i]>=2) cnt++;
        }
        System.out.print(cnt);
    }
    //현재 좌표부터 x만큼 양수방향으로 이동하면서 지나간 공간에 ++
    public static void right(int x){
        for(int i=curr;i<curr+x;i++){
            visit[i+OFFSET]++;
        }
        //마지막으로 좌표 수정해주기
        curr+=x;

    }
    //현재 좌표부터 x만큼 음수방향으로 이동하면서 지나간 공간에 ++
    public static void left(int x){
        for(int i=curr;i>curr-x;i--){
            visit[i+OFFSET]++;
        }
        //마지막으로 좌표 수정해주기
        curr-=x;
    }
}