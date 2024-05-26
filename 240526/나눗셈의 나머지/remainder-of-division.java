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
            for(int i=0;i<10;i++)
            {
                if(a%b==i)
                {
                    arr[i]++;
                }
            }
            a/=b;

        }
        for(int i=0;i<10;i++)
        {
            sum+=arr[i]*arr[i];
        }
    
        System.out.print(sum);
          

       
    }
}