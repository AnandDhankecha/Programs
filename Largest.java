import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x :");
        int x = sc.nextInt();
        System.out.print("Enter y :");
        int y = sc.nextInt();
        System.out.print("Enter z :");
        int z = sc.nextInt();
        if(x>y && x>z)
        {
            System.out.println("Largest : "+x);
        }else if(y>z){
            System.out.println("Largest : "+y);
        }
        
    }
}
