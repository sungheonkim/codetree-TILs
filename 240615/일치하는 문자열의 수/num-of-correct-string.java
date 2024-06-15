import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String tmp=sc.next();
        int sum=0;

        for(int i=0;i<a;i++)
        {
           String k=sc.next();
           if(k.equals(tmp))
           {
                sum++;
           }
        }
      
        System.out.print(sum);
    }
}