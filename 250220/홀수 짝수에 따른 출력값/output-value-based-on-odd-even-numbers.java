import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(F(n));
    }
    public static int F(int n){
        if(n%2==0)
        {
            if(n<=2) return 2;
            else return F(n-2)+n;
        }
        else{
            if(n<=1) return 1;
            else return F(n-2)+n;
        }
    }
}