import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[100];
        System.out.println("Enter n : ");
        int n =  sc.nextInt();
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        //System.out.println("Arr : "+arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]);
        int l  = arr.length;
        int temp[] = new int[100];
        int j=0;
        for (int i = 0; i < l -1; i++) {
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
                //System.out.println("temp:"+temp[j++]);
            }
        }
        temp[j++]=arr[l-1];
        for (int i = 0; i < temp.length; i++) {
            arr[i]=temp[i];
        }
        n = j;
        for (int i = 0; i < n -1 ; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
