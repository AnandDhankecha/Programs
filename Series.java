import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int k = 0;
        for(int i = 1; i<=n;i++)
        {
            int s = k+i;
            k=s;
            System.out.print(s+",");
        }
    }
}
