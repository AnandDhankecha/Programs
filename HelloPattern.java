import java.util.Scanner;

public class HelloPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String str = sc.nextLine();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(str.toUpperCase().charAt(j));
            }System.out.println();
        }
        
    }
}
