import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Score[] score=new Score[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            score[i]=new Score(name,score1,score2,score3);
        }
        Arrays.sort(score);
        for (int i = 0; i < n; i++) {
            
            System.out.printf("%s %d %d %d\n",score[i].name,score[i].score1,score[i].score2,score[i].score3);
        }
        // Please write your code here.
    }
}
class Score implements Comparable<Score>{
    String name="";
    int score1;
    int score2;
    int score3;
    public Score(String name,int score1,int score2,int score3){
        this.name=name;
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
    }
    @Override
    public int compareTo(Score score){
        return(this.score1+this.score2+this.score3)-(score.score1+score.score2+score.score3);
    }
}








맞았습니다!

입력



3
lee 50 60 70 
kim 70 80 70
    }
    @Override
    public int compareTo(Score score){
        return(this.score1+this.score2+this.score3)-(score.score1+score.score2+score.score3);
    }
}