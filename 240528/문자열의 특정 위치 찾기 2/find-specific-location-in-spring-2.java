import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{ "apple", "banana", "grape", "blueberry", "orange" };
        Scanner sc=new Scanner(System.in);
        char tmp=sc.next().charAt(0);
        int cnt=0;
        for(int i=0;i<arr.length;i++)
            {
                for(int j=2;j<4;j++)
                {
                    if(arr[i].charAt(j)==tmp)
                    {
                        System.out.println(arr[i]);
                        cnt++;
                        break;  
                    }
                }
            }   
            System.out.print(cnt); 
    }
}