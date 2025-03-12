import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] answer=new int[n+1];

        Number[] number = new Number[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            number[i] = new Number(arr[i], i+1);
        }
        Arrays.sort(number);

        for(int i=0;i<n;i++){
            answer[number[i].index]=i+1;
        }
        for(int i=1.;i<=n;i++){
            System.out.print(answer[i] + " ");
        }
    

        
    }
}

class Number implements Comparable<Number>{
    int num;
    int index;

    public Number(int num, int index){
        this.num = num;
        this.index = index;
    
    }
 
    
    @Override
    public int compareTo(Number number){
        if(number.num != this.num) {
            return this.num-number.num; 
        }
        return this.index-number.index; 
    }
}