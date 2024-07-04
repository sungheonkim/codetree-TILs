import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Queue<Integer> q=new LinkedList<>();

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            String tmp=sc.next();

            if(tmp.equals("push")){
                int num=sc.nextInt();
                q.add(num);
            }
            if(tmp.equals("pop")){
                System.out.println(q.poll());
            }
            if(tmp.equals("size")){
                System.out.println(q.size());
            }
            if(tmp.equals("empty")){
                if(q.isEmpty()){
                System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            if(tmp.equals("front")){
                System.out.println(q.peek());
            }
        }

    }
}