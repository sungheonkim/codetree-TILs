import java.util.Scanner;
public class Main {
    public static int yesno(int a)
    {
        int tmp=0;
        if(a%2==0)
        {
            for(int i=0;i<a;i++)
            {
                tmp+=a%i;
                a=a/10;
                
            }
            if(tmp%5==0)
            {
                return 1;
            }
            else return 0;
        }
        else
        {   
            return 0;
        }
     
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(yesno(1)==0)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
       
    }
}