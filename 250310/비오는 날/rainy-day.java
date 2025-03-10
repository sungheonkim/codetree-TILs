import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Rain[] rains=new Rain[n];

        int index=0;
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            if(weather.equals("Rain")) index=i;
            rains[i]=new Rain(date,day,weather);
            // Please write your code here.
        }

    
        for(int i=0;i<n;i++){
            if(rains[i].date.compareTo(rains[index].date)<0)
            {
                if(rains[i].weather.equals("Rain")){
                    index=i;
                }
            }
        }
        System.out.println(rains[index].date+" "+rains[index].day+" "+rains[index].weather);
    }
}
class Rain{
    String date;
    String day;
    String weather;
    public Rain(){
        date="";
        day="";
        weather="";
    }
    public Rain(String date,String day,String weather){
        this.date=date;
        this.day=day;
        this.weather=weather;
    }
}