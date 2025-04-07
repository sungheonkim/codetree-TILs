//N 개발자, T번(t초 시간), x개발자, y개발자
//정황 x개발자와 y개발자 악수, K번 악수까지만 전염병,
//전염된 사람끼지 만나도 전염임
import java.util.*;
public class Main {
    public static int[] pollution;
    public static int[] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //개발자
        int K = sc.nextInt(); // K번 악수
        int P = sc.nextInt(); // 처음 감영된 개발자 번호
        int T = sc.nextInt(); // t초

        //전염되었는지 판단하는 배열
        result=new int[N+1];
        //처음 감염된 개발자
        result[P]=1;
        //몇번 감염시킬 수 있는지 저장
        pollution=new int[N+1];
        Arrays.fill(pollution,K);

        int[][] shakes = new int[T][3];
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt();
            shakes[i][1] = sc.nextInt();
            shakes[i][2] = sc.nextInt();
        }
        //시간 별로 정렬
        Arrays.sort(shakes,new ShakeComparator());

        for(int i=0;i<T;i++){
            //둘다 감염되어 있는 상태라면
            if(result[shakes[i][1]]==1&&result[shakes[i][2]]==1){
                //System.out.print(1);
            }
            else{
                if(result[shakes[i][1]]==1&&pollution[shakes[i][1]]>0){
                    //y개발자 감염
                    result[shakes[i][2]]=1;
                    //감염 시킬 수 있는 횟수 줄이기
                    pollution[shakes[i][1]]--;
                }
                else if(result[shakes[i][2]]==1&&pollution[shakes[i][2]]>0){
                    //y개발자 감염
                    result[shakes[i][1]]=1;
                    //감염 시킬 수 있는 횟수 줄이기
                    pollution[shakes[i][2]]--;
                }
            }
        }
        for(int i=1;i<=N;i++){
            System.out.print(result[i]);
        }
        
        // Please write your code here.
    }

}
//커스텀 comparator
class ShakeComparator implements Comparator<int[]>{
    @Override
    public int compare(int[] a, int[] b){
        return Integer.compare(a[0],b[0]);
    }
}