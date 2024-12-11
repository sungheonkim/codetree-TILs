import java.util.*;

public class Main {
    public static boolean[] visited;
    public static List<Integer> list=new ArrayList<>();
    public static void print(){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static void backtrack(int curr,int n){
        if(curr==0){
            print();
            return;
        }

        for(int i=n;i>0;i--){
            if(visited[i]) continue;
            visited[i]=true;
            list.add(i);

            backtrack(curr-1,n);

            list.remove(list.size()-1);
            visited[i]=false;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        visited= new boolean[n+1];

        backtrack(n,n);
}
}