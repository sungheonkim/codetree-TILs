import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=100;
        char minCode='A';
        // Please write your code here.\
        CodeName[] codeNames=new CodeName[5];
        for(int i=0;i<5;i++){
            codeNames[i]=new CodeName();
            codeNames[i].code=sc.next().charAt(0);
            codeNames[i].score=sc.nextInt();

            if(min>codeNames[i].score){
                min=codeNames[i].score;
                minCode=codeNames[i].code;
            }
        }
        System.out.println(minCode+" "+min);
    }
}
class CodeName{
    char code;
    int score;
    public CodeName(){
        this.code='0';
        this.score=0;
    }
    public CodeName(char code, int score){
        this.code=code;
        this.score=score;
    }
    
}