import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int sum=a*b*c;
        System.out.println(F(sum));
    }
    public static int F(int sum){
        if(sum<10) return sum;
        return F(sum/10)+sum%10;
    }
}