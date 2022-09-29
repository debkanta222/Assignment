package ArraysAssignment;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) 
    {
        int length, p,element;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        length = sc.nextInt();
        int arr[] = new int[length+1];
        System.out.println("Enter "+length+" elements:");
        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element which you want to insert:");
        element = sc.nextInt();
        arr[length] = element;
        System.out.print("After inserting : ");
        for(int i = 0; i <length; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[length]);
        
    }
}