import java.util.*;


public class Main {
    public static int[] arr;

    //생성시 input도 받기
    public static void Input(int a){
        arr=new int[a];
        System.out.println(a);
     

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

    }

    public static void Result(int i,int j){
        int sum=0;
        for(int k=i-1;k<j;k++){
            sum+=arr[k];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(a+" "+b);
        Input(a);// 배열 입력받기

        for(int k=0;k<b;k++){
            int i=sc.nextInt();
            int j=sc.nextInt();
            Result(i,j);
        }
        sc.close();


    }
}