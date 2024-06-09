import java.util.Scanner;

public class OddEvenBitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        boolean isEven = false;
        if((n ^ 1) == (n+1))
        {
            isEven  = true;
        }
        else
        {
            isEven= false;
        }
        if(isEven)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
