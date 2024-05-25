import java.util.Scanner;
public class Main {
    //윤년인지 판별 1=윤년, 0=평년
    public static boolean yoon(int n)
    {
        if(n%4==0)
        {
            if(n%100==0&&n%400==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else{return false;}
    }
  
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
      

        System.out.print(yoon(a));
    }
}
//a-b 까지 for문 돌려야 한다
// 숫자의 각 자리를 다 판별해서 3,6,9중 하나 있는ㅈ ㅣ판별 (for 문과 cnt 사용하자)
// 3의 배수인지 ?