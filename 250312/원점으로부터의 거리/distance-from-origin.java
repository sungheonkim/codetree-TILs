import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        Distance[] distance=new Distance[n];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            distance[i]=new Distance(points[i][0],points[i][1],i+1);
        }
        Arrays.sort(distance);
        for (int i = 0; i < n; i++) {
           System.out.printf("%d\n",distance[i].num);
        }
        // Please write your code here.
    }
}
class Distance implements Comparable<Distance>{
    int num;
    int man;
    public Distance(int points1,int points2,int num){
        this.man=Math.abs(0-points1)+Math.abs(0-points2);
        this.num=num;
    }
    @Override
    public int compareTo(Distance distance){
        return this.man-distance.man;
    }
}