import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        if(a>0100)
        {
        System.out.print("vaper");
        }
        else if(a>=0)
        {
            System.out.print("water");
        }
        else
        {
            System.out.print("ice");
        }
    }
}