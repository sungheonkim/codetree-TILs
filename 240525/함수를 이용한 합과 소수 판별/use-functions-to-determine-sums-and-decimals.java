import java.util.Scanner;
public class Main {
    //윤년인지 판별 1=윤년, 0=평년
    public static boolean soso(int a)
    {
        if(a>2){
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
        }
        else return false;
        
    }
    public static boolean odd(int a)
    { 
        int sum=0;
        while(a>0)
        {
            sum+=a%10;
            a/=10;
        }
        if(sum%2==0)
        {return true;}
        else
        {return false;}

    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
    
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            if(soso(i)&&odd(i))
            {
                sum++;
            }
        }
       

      

        System.out.print(sum);
    }
}
//a-b 까지 for문 돌려야 한다
// 숫자의 각 자리를 다 판별해서 3,6,9중 하나 있는ㅈ ㅣ판별 (for 문과 cnt 사용하자)
// 3의 배수인지 ?