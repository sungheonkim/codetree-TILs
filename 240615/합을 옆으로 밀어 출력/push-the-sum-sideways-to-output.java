import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;

    
        for(int i=0;i<a;i++)
        {
            sum+=sc.nextInt();
        }
        String str=Integer.toString(sum);

        str=str.substring(1,str.length())+str.substring(0,1);
        System.out.print(str);

        
    }
}