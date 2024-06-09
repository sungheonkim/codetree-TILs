import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세.
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       
        int k=sc.nextInt();
        
        int len=str.length();
    
        for(int i=0;i<k;i++)
        {
            int tmp=sc.nextInt();
      
            if(tmp==1)
            {   
                str=str.substring(1,len)+str.substring(0,1);
                System.out.println(str);
            }
            else if(tmp==2)
                {
                str=str.substring(len-1)+str.substring(0,len-1);
                System.out.println(str);
            }
            else if(tmp==3)
            {   ;
                char[] arr=str.toCharArray();
                
                for(int j=0;j<len/2;j++)
                {   
                   
                    char tmp2=arr[j];
                    arr[j]=arr[len-1-j];
                    arr[len-1-j]=tmp2;
                    
                }
               
                str="";
                for(int j=0;j<len;j++)
                {
                    str+=arr[j];
                }
                System.out.println(str);
            }
          
            
        }
    }
}