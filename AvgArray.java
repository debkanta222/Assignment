package Practice2;
import java.util.*;
public class AvgArray {

	public static void main(String[] args) {
        System.out.println("How many numbers you want to enter?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int total = 0;

        for(int i=0; i<arr.length; i++){
        	System.out.print("Enter Element No."+(i+1)+": ");
        	arr[i] = scan.nextInt();
        }
        scan.close();
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }    
        int average = total / arr.length;
        
        System.out.println("the average is : " + average);
    }
}