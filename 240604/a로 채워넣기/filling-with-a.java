import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        

        arr[1]='a';
        arr[str.length()-2]='a';
 
        for(int i=0;i<str.length();i++)
        {
            System.out.print(arr[i]);
        }
       
    }
}