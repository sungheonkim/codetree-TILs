import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int arr[] = new int[10];
        int i=0;
        for(i=0;i<10;i++)
        {
             arr[i]=sc.nextInt();
        }
         for(i=0;i<10;i++)
        {
            
            if(arr[i]>=250)
            {
                break;
            }
            sum+=arr[i];
             
        }
    System.out.printf("%d %.1f",sum,(double)sum/(i));
    }
}