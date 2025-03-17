import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] digits=new int[20];
        int cnt=0;

        while(true){
            if(a<b){
                digits[cnt++]=a;
                break;
            }

            digits[cnt++]=a%b;
            a/=b;
        }
        for(int i=cnt-1;i>=0;i--){
            System.out.print(digits[i]);
        }
        // Please write your code here.
    }
}