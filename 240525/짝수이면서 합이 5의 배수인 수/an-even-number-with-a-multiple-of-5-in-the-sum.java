import java.util.Scanner;
public class Main {
    public static int yesno(int a)
    {
        int tmp=0;
        int cnt=0;
        if(a%2==0)
        {
            while(a>0){
                tmp+=a%10;
                a=a/10;
            }
            

            if(tmp%5==0)
            {
                cnt++;
            }
            else return 0;
        }
        return cnt;
     
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(yesno(a)==1)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
       
    }
}