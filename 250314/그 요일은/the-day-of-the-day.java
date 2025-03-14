import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(); // 시작 월
        int d1 = sc.nextInt(); // 시작 일
        int m2 = sc.nextInt(); // 종료 월
        int d2 = sc.nextInt(); // 종료 일
        String A = sc.next();  // 찾고자 하는 요일
        
        // 요일 매핑 (0: 일, 1: 월, 2: 화, 3: 수, 4: 목, 5: 금, 6: 토)
        String[] dayOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        
        // 시작일의 요일 인덱스 (문제에서 시작일 요일이 주어짐)
        int startDayIndex = 1; // 
        
        // 찾고자 하는 요일의 인덱스 찾기
        int targetDayIndex = -1;
        for (int i = 0; i < dayOfWeek.length; i++) {
            if (dayOfWeek[i].equals(A)) {
                targetDayIndex = i;
                break;
            }
        }
        
        // 시작일부터 종료일까지의 총 일수
        int totalDays = numOfDays(m2, d2) - numOfDays(m1, d1);
        
        // 시작일이 찾고자 하는 요일인 경우 카운트 시작
        int count = (startDayIndex == targetDayIndex) ? 1 : 0;
        
        // 남은 날짜에서 찾고자 하는 요일이 몇 번 나타나는지 계산
        // 7일마다 같은 요일이 반복되므로, (총 일수 / 7)에 해당하는 횟수만큼 해당 요일이 등장
        count += (totalDays / 7);
        
        // 남은 일수(totalDays % 7)에 대해 추가로 해당 요일이 나타나는지 확인
        int remainDays = totalDays % 7;
        for (int i = 1; i <= remainDays; i++) {
            if ((startDayIndex + i) % 7 == targetDayIndex) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    public static int numOfDays(int m, int d) {
        // 계산 편의를 위해 월마다 몇 일이 있는지를 적어줍니다.
        // 2024년은 윤년이므로 2월은 29일까지 있습니다.
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
        for(int i = 1; i < m; i++)
            totalDays += days[i];
        
        // m월의 경우에는 정확히 d일만 있습니다.
        totalDays += d;
        
        return totalDays;
    }
}