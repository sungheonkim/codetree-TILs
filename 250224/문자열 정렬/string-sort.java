import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please Write your code.
        char[] str=s.toCharArray();
        Arrays.sort(str);
        String newStr =new String(str);
        System.out.println(newStr);
    }
}