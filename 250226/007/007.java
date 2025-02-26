import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine=sc.nextLine();
        String[] part=inputLine.split(" ");

        String sCode=part[0];
        char mPoint=part[1].charAt(0);
        int time=Integer.parseInt(part[2]);
     

        Example example=new Example(sCode,mPoint,time);

        System.out.println("secret code : "+example.sCode);
        System.out.println("meeting point : "+example.mPoint);
        System.out.println("time : "+example.time);

        // Please write your code here.
    }
    
}
class Example{
        String sCode;
        char mPoint;
        int time;
        public Example(String sCode, char mPoint,int time){
            this.sCode=sCode;
            this.mPoint=mPoint;
            this.time=time;
        }

    }