import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int cnt=0;
        char tmp=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(tmp==str.charAt(i))
            {
                cnt++;
            }
        
        }
        System.out.print(cnt);
    }
}