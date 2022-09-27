package Practice2;
import java.util.*;
public class ReverseArray {
	
    public static void main(String[] args) { 
    	Scanner scan = new Scanner(System.in);
    	System.out.println("enter the length : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("original array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(" after reversing : ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}

}