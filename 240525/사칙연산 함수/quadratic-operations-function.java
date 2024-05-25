import java.util.Scanner;
public class Main {
    //윤년인지 판별 1=윤년, 0=평년
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int min(int a,int b)
    {
        return a-b;
    }
  
  public static int mul(int a,int b)
    {   
        return a*b;
    }
  
  public static int div(int a,int b)
    {
        return a/b;
    }
  

  
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        char sign=sc.next().charAt(0);
        int b=sc.nextInt();
        int tmp=0;
       
        if(sign=='+')
        {
            tmp=add(a,b);
        }
        else if(sign=='-')
        {
            tmp=min(a,b);
        }
        else if(sign=='*')
        {
            tmp=mul(a,b);
        }
        else if(sign=='/')
        {
            tmp=    div(a,b);
        }
        else
        {
            System.out.printf("False");
            return ;
        }


      

        System.out.printf("%d %c %d = %d",a,sign,b,tmp);
    }
}
//a-b 까지 for문 돌려야 한다
// 숫자의 각 자리를 다 판별해서 3,6,9중 하나 있는ㅈ ㅣ판별 (for 문과 cnt 사용하자)
// 3의 배수인지 ?