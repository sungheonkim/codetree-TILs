import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;

        for(int j=1;j<=n;j++)
        {
        cnt=0;
        if(j%3==0){
            System.out.print("0 ");
        }
        else
        {
            int i=j;
            while(i>0)
            {
                if((i%10==3)||(i%10==6)||(i%10==9))
                {
                     System.out.print("0 ");
                     cnt++;
                     break;
                }
                else
                {
                   i=i/10;
                }

            }
        if(cnt==0)
        {
            System.out.print(j+" ");
        }
            
        }
        
        
        }
    }
}