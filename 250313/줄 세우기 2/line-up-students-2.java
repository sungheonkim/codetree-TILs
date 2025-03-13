import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] person=new Person[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            person[i]=new Person(height,weight,i+1);
        }
        Arrays.sort(person);
        for(int i=0;i<n;i++){
            System.out.printf("%d %d %d\n",person[i].height,person[i].weight,person[i].num);
        }
        // Please write your code here.
    }
}
class Person implements Comparable<Person>{
    int height;
    int weight;
    int num;

    public Person(int height,int weight,int num){
        this.height=height;
        this.weight=weight;
        this.num=num;
    }
    @Override
    public int compareTo(Person person){
        if(person.height!=this.height){
            return this.height-person.height;
        }   
        return person.weight-this.weight;
    }
}