import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int arr[] = new int[10];
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;

        while(a>0)
        {
            int tmp=a%b;
            sum=tmp*tmp;
            a/=b;

        }
    
        System.out.print(sum);
          

       
    }
}