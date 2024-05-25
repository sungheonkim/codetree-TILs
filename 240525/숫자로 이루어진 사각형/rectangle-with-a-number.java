import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
    
        int cnt=1;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.printf("%d ",cnt);
                if(cnt==9)
                {
                    cnt=1;
                }
                else
                {cnt++;}
            }
            System.out.print("\n");
        }
    }
}