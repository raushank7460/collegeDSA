package Arrays;

import java.util.Scanner;

public class secondMaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of arrys:");
        int len=sc.nextInt();
        System.out.println("enter the ele in array:");
        int[]arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int SecMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                SecMax=max;
                max=arr[i];
            }
            else if(arr[i]>SecMax && arr[i]!=max){
                SecMax=arr[i];
            }
        }
        System.out.println(SecMax);
    }
    
}
