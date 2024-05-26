import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int arr[] = new int[10];
        int i=0,cnt=0;
        for(i=0;i<10;i++)
        {
             arr[i]=sc.nextInt();
        }
         for(i=0;i<10;i++)
        {
            
            if(arr[i]==0)
            {
                break;
            }
            else if(arr[i]%2==0)
            {
                cnt++;
                sum+=arr[i];
            }
             
        }
    System.out.printf("%d %d",cnt,sum);
    }
}