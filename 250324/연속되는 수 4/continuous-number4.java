import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int cnt=0,max=0;
        //둘이 곱했을 때 양수면 부호가 같은거지ㅋ
        for(int i=0;i<n;i++){
            if(i>=1&&(arr[i]>arr[i-1])){
                cnt++;
            }
            else cnt=1;
            max=Math.max(cnt,max);
            //System.out.println(arr[i]+" cnt: "+cnt);
        }
        
        System.out.println(max);
        // Please write your code here.
    }
}