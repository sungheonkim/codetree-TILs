import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        char tmp=arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==tmp)
            {
                arr[i]=arr[0];
            }
        }
        System.out.print(arr);
    }
}