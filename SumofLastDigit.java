import java.util.Scanner;

public class SumofLastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x= a%10;
        int y = b%10;
        System.out.println("Sum : "+(x+y));
    }
}
