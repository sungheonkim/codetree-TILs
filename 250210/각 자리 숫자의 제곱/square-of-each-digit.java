import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print(multi(n));
        // Please write your code here.
    }
    public static int multi(int n){
        if(n<10) return n*n;
        int num=n%10;
        return multi(n/10)+(num*num);
    }
}