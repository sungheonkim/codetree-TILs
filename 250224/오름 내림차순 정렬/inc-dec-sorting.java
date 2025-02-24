import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Please Write your code.
        Arrays.sort(nums);

        //오름차순 정렬
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        //내림차순 정렬
        Integer[] nums2=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(nums2,Collections.reverseOrder());
        
        for(int i=0;i<n;i++){
            System.out.print(nums2[i]+" ");
        }
        System.out.println();

    }
}