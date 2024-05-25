import java.util.Scanner;
public class Main {
    public static void gcd(int a,int b)
    {
       int max=0;
       for(int i=1;i<=Math.min(a,b);i++)
       {
            if(a%i==0&&b%i==0)
            {
                max=i;
            }
       }
       System.out.print(max);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
      
        gcd(a,b);
    }
}