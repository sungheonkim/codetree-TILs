import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           
            if(arr[i]>='0'&&arr[i]<='9')
            {
                sum+=arr[i]-'0';
            }
        }
         System.out.print(sum);

    }
}