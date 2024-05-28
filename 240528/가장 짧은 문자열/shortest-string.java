import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String str3=sc.next();
        int max= Math.max(Math.max(str1.length(),str2.length()),str3.length());
        int min=Math.min(Math.min(str1.length(),str2.length()),str3.length());
        System.out.printf("%d",max-min);

        
    }
}