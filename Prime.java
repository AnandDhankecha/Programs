import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int flag = 1;
        if(n<=1)
        {
            flag = 0;
        }
        for(int i = 2;i<n;i++)
        {
            if(n%i==0)
            {
                flag = 0;
            }
        }
        if(flag==1)
        {
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
