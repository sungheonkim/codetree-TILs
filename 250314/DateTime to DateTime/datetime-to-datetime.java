import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int currA=11;
        int currB=11;
        int currC=11;
        int total=0;

       
        if((B<11)||(B==11&&C<11)){ 
            System.out.println(-1);
            return;
        }
        while(true){
            if((A==currA)&&(B==currB)&&(C==currC)) break;
            total++;//시간증가
            currC++; 
            if(currC==60){
                currC=0;
                currB++;
                if(currB==24){
                    currB=0;
                    currA++;
                }
            }
        }
        System.out.println(total);
    }
}