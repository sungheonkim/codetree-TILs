import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max=0;
        int cnt=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                cnt++;
            }
            else{
                max=Math.max(cnt,max);
                cnt=1;
            }
        }
        System.out.println(max);
        // Please write your code here.
    }
}