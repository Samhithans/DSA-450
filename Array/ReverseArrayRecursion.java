package Array;
import java.util.Scanner;

/**
 * ReverseArrayRecursion
 */
public class ReverseArrayRecursion {
private static void reverse(int[] a, int left, int right) {
        if (left >= right)
            return;
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
        reverse(a, ++left, --right);
    }
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        var sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        reverse(a, 0, n-1);
        System.out.println("Reversed array: ");
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}