import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        
        char[] str1=word1.toCharArray();
        char[] str2=word2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        word1=String.valueOf(str1);
        word2=String.valueOf(str2);

        if(word2.equals(word1)) System.out.println("Yes");
        else System.out.println("No");
        // Please Write your code.
    }
}