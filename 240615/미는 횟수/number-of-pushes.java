import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2=sc.next();

       int cnt=0;
          for(int i=0;i<str.length();i++)
          {
            cnt++;
            str=str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
            // System.out.println(str);
            if(str.equals(str2))
            {
                break;
            }
          }
          if(cnt==str.length())
          {
            System.out.print("-1");
          }
          else{
          System.out.print(cnt);
          }
}
}