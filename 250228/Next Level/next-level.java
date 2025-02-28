import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        User user=new User();
        User user2=new User(id,level);
        System.out.println("user "+ user.id +" lv "+user.level);
        System.out.println("user "+ user2.id+" lv "+user2.level);
    }
}
class User{
    String id;
    int level;
    public User(){
        this.id="codetree";
        this.level=10;
    }
    public User(String id,int level){
        this.id=id;
        this.level=level;
    }
}