package Arrays;

import java.util.Scanner;

public class maxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of arrays:");
        int len=sc.nextInt();
        System.out.println("enter ele in arrays:");
        int[]arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int maxElements=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxElements){
                maxElements=arr[i];
            }
            

        }
        System.out.println(maxElements);

    }
    
}
