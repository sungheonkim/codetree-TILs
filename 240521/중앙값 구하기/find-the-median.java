import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int mid=0;
        if(a>c)
        {
            if(b>c)
            {
                if(a>b)
                {
                    mid=b;
                }
                else
                {
                    mid=a;
                }
            }
            else
            {
                mid=c;
            }
        }
        else
        {
           if(b>a)
            {
                if(c>b)
                {
                    mid=b;
                }
                else
                {
                    mid=c;
                }
            }
            else
            {
                mid=a;
            }
        }
        System.out.print(mid);
            
        }
}