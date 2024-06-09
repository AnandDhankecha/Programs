import java.util.Scanner;

public class SumofOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[100];
        int oddsum=0,evensum=0;
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)
            {
                evensum+=arr[i];
            }else
            {
                oddsum+=arr[i];
            }
        }
        System.out.println("Even Sum:"+evensum+" Odd Sum : "+oddsum);
    }
}
