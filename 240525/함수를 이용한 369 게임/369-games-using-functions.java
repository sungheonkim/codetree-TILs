import java.util.Scanner;
public class Main {
    public static int index(int n)
    {
        while(n>0)
        {
            if(n%10==3||n%10==6||n%10==9)
            {
                return 1;
            }
            n/=10;
        }
        return 0;
    }
    public static int mul(int a, int b)
    {
        int cnt=0;
        for(int i=a;i<=b;i++)
        {
            if(index(i)==1||i%3==0)
            {
                cnt ++;
            }

        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        System.out.print(mul(a,b));
    }
}
//a-b 까지 for문 돌려야 한다
// 숫자의 각 자리를 다 판별해서 3,6,9중 하나 있는ㅈ ㅣ판별 (for 문과 cnt 사용하자)
// 3의 배수인지 ?