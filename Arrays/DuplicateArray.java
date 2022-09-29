package ArraysAssignment;
import java.util.*;
public class DuplicateArray {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the size of the array : ");
int size=scan.nextInt();
int[]array=new int[size];
System.out.println("enter the array elements : ");
for(int i=0;i<size;i++) {
	array[i]=scan.nextInt();
}
for(int i=0;i<size;i++) {
	for(int j=i+1;j<size;j++) {
		if(array[i]==array[j]) {
			System.out.println("the duplicate is : "+array[j]);
		}
	}
}
}
}
