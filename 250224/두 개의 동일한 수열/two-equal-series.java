import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // Please Write your code.
        //a와 b를 정렬하고 각 원소가 같으면 같은 배열
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }
}