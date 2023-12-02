package Array;

import java.util.Scanner;

public class MinAndMaxNum {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        var sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<min) min=a[i];
            else if(a[i]>max) max=a[i];
        }
        System.out.print("Max: "+ max+" Min: "+min);
    }

}
