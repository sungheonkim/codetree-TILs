import java.util.*;
public class Main {
    static int cnt=0;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(F(n));
    }
    public static int F(int n){
        //종료조건
        if(n==1) return cnt;

        cnt++;
        if(n%2==0) return F(n/2);
        else return F(n*3+1);
    }
}