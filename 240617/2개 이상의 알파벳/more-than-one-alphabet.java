import java.util.*;
public class Main {
    public static String alpa(String str)
    {
        char tmp= str.charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(tmp!=str.charAt(i))
            {
                return "Yes";
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(alpa(str));

    }
}