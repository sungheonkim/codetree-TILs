import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        int i=0;
        for(i=0;i<str.length();i++)
        {
            if(arr[i]=='e')
            {
                break;
            }
        }
        String tmp=str.substring(0,i)+str.substring(i+1,str.length());
        System.out.print(tmp);
        
    }
}