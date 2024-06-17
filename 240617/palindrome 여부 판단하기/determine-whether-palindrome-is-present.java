import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        char[] arr=str.toCharArray();
        String str2="";

        for(int i=arr.length-1;i>=0;i--)
        {
            str2+=arr[i];
        }

        if(str2.equals(str))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}