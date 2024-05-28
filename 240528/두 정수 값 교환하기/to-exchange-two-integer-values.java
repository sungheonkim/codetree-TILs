import java.util.*;
public class Main {
    public static void swap(int n,int m)
    {
        int tmp=n;
        n=m;
        m=tmp;
        System.out.print(n+" "+m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        swap(n,m);  
    }
}