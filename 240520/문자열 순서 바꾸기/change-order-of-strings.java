import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();
        String tmp="";
        tmp=a;
        a=b;
        b=tmp;
        System.out.printf("%s\n%s",a,b);
    }
}