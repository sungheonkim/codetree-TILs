import java.util.*;
public class Main {
    public static int callMax(int a,int b)
    {
        return Math.max(a,b)+25;
    }
    public static int callMin(int a,int b)
    {
        return Math.min(a,b)*2;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        if(a<b){
        System.out.print(callMin(a,b)+" "+callMax(a,b));
        }
        else
        {
            System.out.print(callMax(a,b)+" "+callMin(a,b));
        }


    }
}