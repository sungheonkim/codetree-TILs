import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Stack<Character> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                s.push('(');
            }
            // ')'일 때
            else{
                if(s.isEmpty()){
                    System.out.print("No");
                    return; // 스택에 암것도 없을 떄
                }
                else{
                    s.pop();
                }
            }//여기까지 하면 스택 처리 완료
        }
        if(s.isEmpty()){
                    System.out.print("Yes");
                    return;
        }
        else{
            System.out.print("No");
            return;
        }


    }
}