import java.util.*;
public class Main {
    public static int[] abs(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Math.abs(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] arr2=abs(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}