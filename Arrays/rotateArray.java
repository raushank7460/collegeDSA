package Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        k=k%n;

        //  reverse entire element
        reverse(arr, 0, n-1);
        
        // reverse first k element

        reverse(arr, 0, k-1);

        //  reverse rest element

        reverse(arr, k, n-1);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
       
        
    }
    

    public static void reverse(int[]arr,int start, int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

            
        }
    }
    
}
