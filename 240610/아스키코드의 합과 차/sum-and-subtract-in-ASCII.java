import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int a=(int)sc.next().charAt(0);
        int b=(int)sc.next().charAt(0);
        if(a<b)
        {
            int tmp=a;
            a=b;
            b=tmp;
        }
        System.out.printf("%d %d",a+b,a-b);
    }
}