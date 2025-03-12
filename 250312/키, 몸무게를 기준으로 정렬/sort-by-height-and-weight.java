import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] person=new Person[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            person[i]=new Person(name,height,weight);
            // Please write your code here.
        }
        Arrays.sort(person);

        for(int i=0;i<n;i++){
            System.out.printf("%s %d %d\n",person[i].name,person[i].height,person[i].weight);
        }
    }
    
}
class Person implements Comparable<Person>{
        String name;
        int height;
        int weight;
        public Person(String name,int height,int weight){
            this.name=name;
            this.height=height;
            this.weight=weight;
        }
        public int compareTo(Person person){
            if(person.height!=this.height){
                return this.height-person.height;
            }
            return person.weight-this.weight;
        }
    }