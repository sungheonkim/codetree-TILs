import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String minus=str.substring(0,1)+str.substring(2,str.length()-2)+str.substring(str.length()-1,str.length());
        System.out.print(minus);
    }
}