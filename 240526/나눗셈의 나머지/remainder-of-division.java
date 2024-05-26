import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int arr[] = new int[10];
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;

        while(a>1)
        {
            arr[a%b]++;
            a/=b;

        }
        for(int i=0;i<10;i++)
        {
            sum+=arr[i]*arr[i];
        }
    
        System.out.print(sum);
          

       
    }
}