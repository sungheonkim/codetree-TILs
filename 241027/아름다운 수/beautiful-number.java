import java.util.*;
public class Main {
    public static int n;
    public static int ans;

    public static List<Integer> seq=new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();

        backtrack(0);
        System.out.print(ans);
    }
    //아름다운수인지 판별
    public static boolean isBeautiful(){
        for(int i=0;i<n;i+=seq.get(i)){
            if(i+seq.get(i)-1>=n) return false;

            for(int j=i;j<i+seq.get(i);j++){
                if(seq.get(j)!=seq.get(i)){
                    return false;
                }
            }
        }
        return true;
    }
    //백트랙
    public static void backtrack(int cnt){
        if(cnt==n){
            if(isBeautiful()) ans++;
            return;
        }
        for(int i=1;i<=4;i++){
            seq.add(i);
            backtrack(cnt+1);
            seq.remove(seq.size()-1);
        }
    }
}