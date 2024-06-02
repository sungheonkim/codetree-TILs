import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String strsum ="";
        int n=sc.nextInt();
        String[] str= new String[n];

         for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            strsum +=str[i];
        }
       int len=strsum.length();

        for(int i=0;i<len;i++)
        {
             System.out.print(strsum.charAt(i));
             if((i+1)%5==0)
             {
                System.out.println();
             }
        }

    

   
}
}