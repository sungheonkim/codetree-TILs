import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        char[] arr=str.toCharArray();
        char tmp=arr[0];
        for(int i=0;i<str.length();i++)
        {
            if(arr[i]==tmp)
            {
                arr[i]=arr[1];
            }
        }
        arr[1]=tmp;

        System.out.print(arr);

    }
}