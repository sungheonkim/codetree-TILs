import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();
        int cnt=0;
        // char tmp=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(' '!=str.charAt(i))
            {
                System.out.print(str.charAt(i));
            }
        
        }
        for(int i=0;i<str2.length();i++)
        {
            if(' '!=str2.charAt(i))
            {
                System.out.print(str2.charAt(i));
            }
        
        }
        
    }
}