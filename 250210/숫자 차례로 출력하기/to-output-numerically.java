import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Please write your code here.

        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}