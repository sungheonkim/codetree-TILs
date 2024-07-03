import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Stack<Integer> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String tmp=sc.next();
            if(tmp.equals("push")){
                int num=sc.nextInt();
                s.push(num);
            }
            if(tmp.equals("size")){
                System.out.println(s.size());

            }
            if(tmp.equals("empty")){
                if(s.isEmpty()){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            if(tmp.equals("pop")){
                System.out.println(s.peek());
                 s.pop();
            }
            if(tmp.equals("top")){
                 System.out.println(s.peek());
            }      

        }
    }
}