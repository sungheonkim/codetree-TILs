import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();
        char[] arr=a.toCharArray();
        char[] arr2=b.toCharArray();
        int sum=0;
        String tmp="";
        String tmp2="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>='0'&&arr[i]<='9')
            {
                tmp+=arr[i];
            }
            
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]>='0'&&arr2[i]<='9')
            {
                tmp2+=arr2[i];
            }
           
        }
        
        System.out.print(Integer.parseInt(tmp)+Integer.parseInt(tmp2));

    }
}