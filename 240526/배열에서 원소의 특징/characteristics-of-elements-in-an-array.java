import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int arr[] = new int[10];
        int cnt=0;
      
        for(int i=0;i<10;i++)
        {
             arr[i]=sc.nextInt();
        }
         for(int i=0;i<10;i++)
        {
            
            if(arr[i]%3==0)
            {
                break;
            }
            cnt++;
          
        }
         System.out.print(arr[--cnt]);
 
    }
}