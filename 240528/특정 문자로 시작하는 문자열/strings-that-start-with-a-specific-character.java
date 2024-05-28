import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String[] arr = new String[a];
        
        for(int i=0;i<a;i++)
            {
                arr[i]=sc.next();

            }   

        char tmp=sc.next().charAt(0);
        int cnt=0;
        int leng=0;
        for(int i=0;i<a;i++)
            {
                if(arr[i].charAt(0)==tmp)
                {cnt++;
                leng+=arr[i].length();
                }
               
            }   
          System.out.printf("%d %.2f",cnt,(double)leng/cnt); 
    }
}