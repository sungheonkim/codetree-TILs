import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];
        int[] cntPerson= new int[n+1];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }
        
        int ans=-1;
        for(int i=0;i<m;i++){
            int target= penalizedPerson[i];
            cntPerson[target]++;

            if(cntPerson[target]>=k){
                ans=target;
                break;
            }
        }
        System.out.println(ans);
        // Please write your code here.
    }
}