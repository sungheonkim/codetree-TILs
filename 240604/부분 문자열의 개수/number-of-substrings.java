import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String tmp=sc.next();
        int lengthTmp=tmp.length();
        int index=0;
 
        for(int i=0;i<str.length()-lengthTmp+1;i++)
        {
        if(str.substring(i,i+lengthTmp).equals(tmp))
        {
            index++;
           
        }
        }

       
             System.out.print(index);
    
    
       
    }
}