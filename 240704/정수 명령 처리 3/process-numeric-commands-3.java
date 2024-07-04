import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        Deque<Integer> dq= new ArrayDeque<>();


        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            String tmp=sc.next();

            if(tmp.equals("push_front")){
                int k=sc.nextInt();
                dq.addFirst(k);
            }
            if(tmp.equals("push_back")){
                int k=sc.nextInt();
                dq.addLast(k);
            }
            if(tmp.equals("pop_front")){
                System.out.println(dq.pollFirst());
            }
            if(tmp.equals("pop_back")){
                System.out.println(dq.pollLast());
            }
            if(tmp.equals("size")){
                System.out.println(dq.size());
            }
            if(tmp.equals("empty")){
                if(dq.isEmpty()){
                        System.out.println("1");
                }
                else{
                     System.out.println("0");
                }
            }
            if(tmp.equals("front")){
                System.out.println(dq.peekFirst());
            }
            if(tmp.equals("back")){
                System.out.println(dq.peekLast());
       
            }
        }

    }
}