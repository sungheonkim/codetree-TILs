import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       

        while(true)
        {
             String tmp=sc.next();
             if(tmp.equals("END"))
             {
                break;
             }
             else
             {
                for(int i=tmp.length()-1;i>=0;i--)
                {
                    System.out.print(tmp.charAt(i));
                }
                System.out.print("\n");
             }
        }  
}
}