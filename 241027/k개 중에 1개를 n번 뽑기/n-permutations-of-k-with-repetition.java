import java.util.*;

public class Main {
    public static int k,n;
    public static List<Integer> numbers=new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        n=sc.nextInt();
        backtrack(0);
        
    }
    public static void print(){
        for(int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println();
    }
    public static void backtrack(int cnt){
        if(cnt==n){
            print();
            return;
        }
        for(int i=1;i<=k;i++){
            numbers.add(i);
            backtrack(cnt+1);
            numbers.remove(numbers.size()-1);
        }
    }

}