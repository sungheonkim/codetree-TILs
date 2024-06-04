import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        char[] arr=str.toCharArray();
        char tmp=arr[0];
        char tmp2=arr[1];
        for(int i=0;i<str.length();i++)
        {
            if(arr[i]==tmp)
            {
                arr[i]=tmp2;
            }
            else if (arr[i]==tmp2)
            {
                arr[i]=tmp;
            }
        }
       
   

        System.out.print(arr);

    }
}