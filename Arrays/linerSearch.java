package Arrays;
import java.util.*;
public class linerSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Target Ele:");
        int X=sc.nextInt();
        System.out.println("enter the size of arrays");
        int num=sc.nextInt();
        System.out.println("enter the ele in arrays:");
        int[]arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==X){
                flag=true;
            }
        }
        if(flag==true) System.out.println("Element Found");
        else{
            System.out.println("Element Not Found");
        }
        
        
    }
    
}
