import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        Bomb bomb=new Bomb(uCode,lColor,time);

        System.out.printf("code : %s\n",bomb.code);
        System.out.printf("color : %c\n",bomb.color);
        System.out.printf("second : %d\n",bomb.second);

        // Please write your code here.
    }
}
class Bomb{
    String code;
    char color;
    int second;
    public Bomb(){
        this.code="k";
        this.color='k';
        this.second=0;
    }
    public Bomb(String code,char color,int second){
        this.code=code;
        this.color=color;
        this.second=second;

    }
}