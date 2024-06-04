import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String str2=sc.next();
        String tmp=str.substring(0,2);
        String tmp2=str2.substring(2,str2.length());

        System.out.print(tmp+tmp2);
       
    }
}