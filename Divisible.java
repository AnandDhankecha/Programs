import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 150,b=445;
        System.out.print("Odd number divisible by 7 but not by 3 : ");
        for(int i = a;i<b;i++)
        {
            if(i%7==0 && i%3!=0 && i%2!=0)
            {
                System.out.print(i+",");
            }
        }
    }
}
