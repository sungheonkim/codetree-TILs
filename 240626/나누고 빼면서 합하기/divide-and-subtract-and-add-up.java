import java.util.*;
public class Main {
    public static int []arr;
    public static int sum=0;

    public static void plus(int n){
        arr=new int[n];

        
    }
   

    public static void div(int m){
   
        while(m>0){
    
            sum+=arr[m-1];
            if(m%2==0){
                m/=2;
            }
            else{
                m--;
            }
           
           
        }
        
    }
  
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        plus(n);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        div(m);
        System.out.print(sum);
    }
}