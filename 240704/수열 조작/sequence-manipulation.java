import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Deque<Integer> dq=new ArrayDeque<>();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            dq.addLast(i);
        }

        while(dq.size()>1)
        {
            dq.pollFirst();
            if(dq.size()==1){
                break;
            }
            dq.addLast(dq.pollFirst());
        }
        
        System.out.print(dq.peekFirst());
    }
}