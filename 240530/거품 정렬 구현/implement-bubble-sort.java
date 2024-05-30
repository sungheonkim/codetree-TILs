import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
        // 여기에 코드를 작성해주세요.

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1])
                {
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}