import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String target=sc.next();
        for(int i=0;i<=str.length()-target.length();i++)
        {   
            // System.out.println(i);
            if(str.substring(i,i+target.length()).equals(target))
            {
                str=str.substring(0,i)+str.substring(i+target.length(),str.length());
              
                // System.out.println(str+" "+i);
                i=-1;
               
                
            }
        }
        System.out.print(str);
    }
}