import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
            // 홀수 번째 숫자마다 중앙값 출력 (0부터 시작하므로 i가 짝수일 때)
            if (i % 2 == 0) {
                // 현재까지 입력받은 숫자들만 정렬
                int[] temp = Arrays.copyOf(arr, i+1);
                Arrays.sort(temp);
                
                // 인덱스는 0부터 시작하므로 중앙값은 현재 배열 크기의 절반 위치에 있음
                int median = temp[i/2];
                
                System.out.print(median+" ");
            }
        }
    }
}