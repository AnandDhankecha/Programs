import java.util.Scanner;

public class ElecUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Unit Consumed : ");
        int u = sc.nextInt();
        int charge = 100;
        double c;
        if(u<=200)
        {
            c = u*0.8;
            
        }
        else if(u>200 && u<=300)
        {
            c = 160 + ((u-200)*0.9); 
        }
        else
        {
            c = 250 + ((u-300)*1); 
        }
        if(c<100)
        {
            charge = 100; 
        }else if(c>300)
        {
            c+=((c*12.36)/100);
        }
        System.out.println(c);
    }
}
