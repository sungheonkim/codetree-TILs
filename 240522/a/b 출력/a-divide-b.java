import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int cnt=0;

        for(int i=0;i<21;i++)
        {
    
            System.out.print(a/b);
            if(a/b==0&&cnt==0)
            {
                System.out.print(".");
                cnt++;
            }
            a=a%b*10;
            }
           
        
    
    }
}