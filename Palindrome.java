import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        int num=0;
        int temp=n;
        while(temp !=0)
        {
            int d=temp%10;
            num = (num*10)+d;
            temp=temp/10;
        }
        if(num==n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
