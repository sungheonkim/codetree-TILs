import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        { 
            int tmp=sc.nextInt();
            //1번이라면
            if(tmp==1)
            {
                int a=sc.nextInt()-1;
                int b=sc.nextInt()-1;
                char k= arr[a];
                arr[a]=arr[b];
                arr[b]=k;
            }
            else if(tmp==2)
            {
                char c=sc.next().charAt(0);
                char d=sc.next().charAt(0);
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[j]==c)
                    {
                        arr[j]=d;
                    }
                }
            }
            System.out.println(arr);
            
        }
    }
}