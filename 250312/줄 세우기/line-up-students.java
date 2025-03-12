import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Student[] student=new Student[n];

        for (int i = 0; i < n; i++) {
            int height=sc.nextInt();
            int weight=sc.nextInt();
            student[i]=new Student(height,weight,i+1);
        }
        Arrays.sort(student);
        for(int i=0;i<n;i++){
            System.out.printf("%d %d %d\n",student[i].height,student[i].weight,student[i].number);
        }
        // Please write your code here.
    }
}
class Student implements Comparable<Student>{
    int height;
    int weight;
    int number;
    public Student(int height,int weight,int number){
            this.height=height;
            this.weight=weight;
            this.number=number;

    }
    @Override
    public int compareTo(Student student){
        // 키가 크면 정렬 했을 때 앞에 와야 합니다.
        if(this.height != student.height)
            return student.height - this.height;
        // 몸무게가 크면 정렬 했을 때 앞에 와야합니다.
        if(this.weight != student.weight)
            return student.weight - this.weight;
        // 번호가 작으면 앞에 와야 합니다.
        return this.number - student.number;
    }
}