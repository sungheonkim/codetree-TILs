import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        //0으로 N개 만큼 블록생김
        int[] visit= new int[N];

        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            for(int j=A;j<B;j++){
                visit[j-1]=1;
            }
        }

        int cnt=0;

        for(int i=0;i<K;i++){
            if(visit[i]==1) cnt++;
        }
        System.out.println(cnt);
        // Please write your code here.
    }
}