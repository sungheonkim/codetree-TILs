import java.util.*;

class Sum{
    public static int[] arr;

    //생성시 input도 받기
    public static void Sum(int a){
        arr=new int[a];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }

    public static void result(int i,int j){
        int sum=0;
        for(int k=i-1;k<j;k++){
            sum+=arr[k];
        }   
        System.out.println(sum);
    }
    
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        Sum(a);// 배열 입력받기

        for(int i=0;i<b;i++){
            
            int i=sc.nextInt();
            int j=sc.nextInt();
            result(i,j);
        }

        
        
    }
}