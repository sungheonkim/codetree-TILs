import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        
        Item item1=new Item();
        Item item2=new Item(id2,code2);

        System.out.printf("product %d is %s\n",item1.price,item1.name);
        System.out.printf("product %d is %s",item2.price,item2.name);
        // Please write your code here.
    }
}
class Item{
    String name;
    int price;

    public Item(){
        this.name="codetree";
        this.price=50;
    }
    public Item(String name,int price){
        this.name=name;
        this.price=price;
    }

}