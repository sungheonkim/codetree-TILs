import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons= new Person[n];

        
        for (int i = 0; i < n; i++) {
            String names = sc.next();
            String addresses = sc.next();
            String regions = sc.next();

            persons[i]=new Person(names,addresses,regions);
        }
        // Please write your code here.
        int lastInt=0;
        for(int i=1;i<n;i++){
            if(persons[i].names.compareTo(persons[lastInt].names)>0)
            lastInt=i;
        }
        System.out.println("name "+persons[lastInt].names);
        System.out.println("addr "+persons[lastInt].addresses);
        System.out.println("city "+persons[lastInt].regions);
    }
}
class Person{
    String names;
    String addresses;
    String regions;
    public Person(){
        names="";
        addresses="";
        regions="";
    }
    public Person(String names,String addresses,String regions){
        this.names=names;
        this.addresses=addresses;
        this.regions=regions;

    }
}