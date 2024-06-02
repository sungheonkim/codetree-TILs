import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();

        String strsum1="";
        strsum1+=str1;
        strsum1+=str2;
        String strsum2="";
        strsum2+=str2;
        strsum2+=str1;
        
        if(strsum1.equals(strsum2))
        {
            System.out.print("true");

        }
        else{
            System.out.print("false");
        }
    

   
}
}