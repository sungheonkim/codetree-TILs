import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(F(n));

    }
    public static int F(int n){
        if(n==1) return 1;
        if(n==2) return 2;

        return F(n/3)+F(n-1);
    }
}