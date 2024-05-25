import java.util.Scanner;
public class Main {
    //소수인지 판별하는 부분
    public static int soso(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else{
        for(int j=2;j<n;j++){
    
            if(n%j==0)
            {
                return 0;
            }
            }
            return 1;
        }
    }
    // for문으로 소수 더하기    
    public static int index(int a,int b)
    {
        int sum=0;
       for(int i=Math.min(a,b);i<=Math.max(a,b);i++)
        {
            if(soso(i)==1)
            {
                sum+=i;
            }

        }
        return sum;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        System.out.print(index(a,b));
    }
}
//a-b 까지 for문 돌려야 한다
// 숫자의 각 자리를 다 판별해서 3,6,9중 하나 있는ㅈ ㅣ판별 (for 문과 cnt 사용하자)
// 3의 배수인지 ?