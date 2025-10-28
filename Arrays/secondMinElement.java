package Arrays;
import java.util.Scanner;

public class secondMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array:");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int SecMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                SecMin = min;
                min = arr[i];
            } else if (arr[i] < SecMin && arr[i] != min) {
                SecMin = arr[i];  
            }
        }

        if (SecMin == Integer.MAX_VALUE) {
            System.out.println("No");
        } else {
            System.out.println("Second minimum: " + SecMin);
        }

        
    }
}
