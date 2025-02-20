import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxValue(n,arr));

    }
    public static int maxValue(int n,int[] arr){
    if(n==1) return arr[0];  // 기저 조건 수정
    return Math.max(maxValue(n-1,arr),arr[n-1]);  // 인덱스 수정
}
}