import java.util.Scanner;
public class Main {

    //시계 방향으로 돌 수 있도록 해준다
    public static int[] dx= new int[]{1,0,-1,0};
    public static int[] dy= new int[]{0,-1,0,1};
    public static int x=0,y=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        int len= commands.length();

        //북쪽 방향 바라보고 시작
        int dir=3;
        int time=0;
        boolean flag=false;

        for(int i=0;i<len;i++){
            char cDir=commands.charAt(i);

            if(cDir=='L') dir=(dir-1+4)%4;
            else if(cDir=='R') dir=(dir+1)%4;
            else{
                x+=dx[dir];
                y+=dy[dir];
            }
            time++;

            if(x==0&&y==0) {
                System.out.println(time);
                flag=true;
                break;
            }
        }
        if(!flag) System.out.println(-1);
        
        // Please write your code here.
    }
}