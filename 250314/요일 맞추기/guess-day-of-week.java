import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] result=new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        int index=0; //시작이 월욜

        while(true){
            if(m1==m2&&d1==d2) break;
            index=(index+1)%7; // 토->일 처리
            d1++;
            if(d1>days[m1]){
                d1=1;
                m1++;
            }
             if(m1 > 12) {
                    m1 = 1;
                }
        }
        System.out.println(result[index]);
        // Please write your code here.
    }
}