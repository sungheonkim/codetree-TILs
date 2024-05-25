import java.util.Scanner;
public class Main {
    public static int sum(int a)
    {
        int tmp=0;
       for(int i=1;i<=a;i++)
       {   
            tmp+=i;
       }
       return (tmp/10);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print(sum(a));
    }
}