package Array;
import java.util.Scanner;

/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        var sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int left=0, right=n-1, temp;
        for(int i=0;i<n/2;i++){
            temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        sc.close();
        System.out.println("Reversed array: ");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}