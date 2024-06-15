import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();

        String tmp= a+b;
        String tmp2=b+a;

        int sum1=Integer.parseInt(tmp);
        int sum2=Integer.parseInt(tmp2);

        System.out.print(sum1+sum2);

    }
}