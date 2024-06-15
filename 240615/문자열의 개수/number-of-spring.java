import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
        int cnt=0;
        while(true)
        {   
            cnt++;
             String tmp=sc.next();
             if(tmp.equals("0"))
             {
                break;
             }
             else 
             {
                if(cnt%2==0)
                {
                    continue;
                }
                else
                {
                    
                    str+=tmp+"\n";
                }
                
             }
        }
        System.out.println(cnt-1);
        System.out.print(str);  
}
}