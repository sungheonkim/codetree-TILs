import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // int b=sc.nextInt();
        if(a<5)
        {
            System.out.printf("%d\ntiny",a*a);

        }
        else
        {
            System.out.print(a*a);
        }
    }
}