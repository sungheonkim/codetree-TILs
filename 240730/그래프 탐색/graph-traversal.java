import java.util.*;
public class Main {
    static boolean[] visited;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);

        List<List<Integer>> list=new ArrayList<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        

        visited=new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            int tmp=sc.nextInt();
            int tmp2=sc.nextInt();

            list.get(tmp).add(tmp2);
            list.get(tmp2).add(tmp);

        }
        System.out.print(list);
        dfs(v,list);
    }
    private void dfs(int v,List<List <Integer>> list){
        if(visited[v]){
            return;
        }
        visited[v]=true;
        System.out.println(v+"방문함"+visited[v]);
        List<Integer> tmp =list.get(v);

        for(int i=0;i<tmp.size();i++){
            if(!visited[tmp.get(i)]){
                dfs(tmp.get(i),list);
            }
        }
        


    }
}