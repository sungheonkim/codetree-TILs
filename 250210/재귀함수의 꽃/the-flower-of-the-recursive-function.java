import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        printStar(n);
    }
    public static void printStar(int n){
        if(n==0) return;

        System.out.print(n+" ");
        printStar(n-1);
        System.out.print(n+" ");
    }
}