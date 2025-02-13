import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n,0));
    }
    public static int sum(int num,int cnt){

        if(num<=1) return cnt;
        
        if(num%2==0) return sum(num/2,cnt+1); //짝수라면 그냥 넘어가기
        else return sum(num/3,cnt+1); //홀수라면 더하기

    }
}