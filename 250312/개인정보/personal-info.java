import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Student[] student=new Student[5];
        
        for (int i = 0; i < n; i++) {
            String name= sc.next();
            int heights = sc.nextInt();
            double weights = sc.nextDouble();
            student[i]=new Student(name,heights,weights);
        }
        Arrays.sort(student,new Comparator<Student>(){
            @Override
            public int compare(Student a,Student b){
                return a.name.compareTo(b.name);
            }
        });
        System.out.println("name");
        for(int i=0;i<n;i++){
            System.out.printf("%s %d %.1f\n",student[i].name,student[i].heights,student[i].weights);
        // Please write your code here
        }
        Arrays.sort(student,new Comparator<Student>(){
            @Override
            public int compare(Student a,Student b){
                return b.heights-a.heights;
            }
        });
        System.out.println();
        System.out.println("height");
        for(int i=0;i<n;i++){
            System.out.printf("%s %d %.1f\n",student[i].name,student[i].heights,student[i].weights);
        // Please write your code here
        }
        
    }
}
class Student{
    String name;
    int heights;
    double weights;
   
    public Student(String name,int heights,double weights){
        this.name=name;
        this.heights=heights;
        this.weights=weights;
    }
    
}