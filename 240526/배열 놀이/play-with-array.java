import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
       
        int a=sc.nextInt();
        int b=sc.nextInt();
         int arr[] = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<b;i++)
        {
            int c=sc.nextInt();
            if(c==1)
            {
                int d=sc.nextInt();
                System.out.println(arr[d-1]);
            }
            else if(c==2)
            {
                int d=sc.nextInt();
                int j=0;
                for(j=0;j<b;j++)
                {
                    if(arr[j]==d)
                    {
                        System.out.println(j+1);
                        break;
                    }

                }
                if(j==b)
                {
                    System.out.println("0");
                }
                
            }
            else if(c==3)
            {
                int d=sc.nextInt();
                int f=sc.nextInt();

                for(int j=d-1;j<f;j++)
                {
                    
                    System.out.print(arr[j]+" ");
                    

                }
            }

        }
       
    }
}