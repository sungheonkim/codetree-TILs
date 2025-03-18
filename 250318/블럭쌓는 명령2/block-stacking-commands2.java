import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // N개의 블록을 0으로 초기화
        int[] visit = new int[N];

        // 색종이 정보 입력 받아 블록 덮기
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            // 배열 인덱스 보정 및 정확한 범위 설정
            for(int j = A-1; j < B; j++){
                visit[j]++;
            }
        }

        // 최대값 찾기 (전체 배열 순회)
        int max = 0;
        for(int i = 0; i < N; i++){
            if(visit[i] > max){
                max = visit[i];
            }
        }

        // 최대 겹침 횟수 출력
        System.out.println(max);
    }
}