package Arrays.basicQue;

public class SumOfArray {
    public static void main(String[] args) {
        int[]arr={100,200,300,400,500,600};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    
}
