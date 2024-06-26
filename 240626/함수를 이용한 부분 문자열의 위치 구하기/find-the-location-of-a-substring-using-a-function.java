import java.util.*;
public class Main {
    public static String str="";
    public static String tmp="";
    
    public static int index(){

       
        for(int i=0;i<str.length()-tmp.length()+1;i++)
        {
            if(str.substring(i,i+tmp.length()).equals(tmp)){
                return i;

            }
        }
        return 0;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        str=sc.next();
        tmp=sc.next();
        int k=index();
        System.out.print(k);
    }
}