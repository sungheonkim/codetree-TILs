import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        String str="";
        for(int i=0;i<5;i++)
        {
            str+=(char)sc.nextInt();
            str+=" ";
        }
    
        
        System.out.print(str);
    }
}