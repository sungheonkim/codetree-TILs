import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num=new int[n];

        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        System.out.println(findLcm(num));
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static int findLcm(int[] num){
        int result=num[0];
        for(int i=0;i<num.length;i++){
            result=lcm(result,num[i]);
        }
        return result;
    }
}