import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int prob=1;
    for(int i=1;i<=b;i++)
    {
        if(i%a==0)
        {
            prob*=i;

        }
    }
    System.out.print(prob);
    }
}