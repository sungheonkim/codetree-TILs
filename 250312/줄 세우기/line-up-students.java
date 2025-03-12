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
        if(student.height==this.height){
            if(student.weight==this.weight){
                return student.number-this.number;
            }
            return student.weight-this.weight;
        }
        return student.height-this.height;
    }
}