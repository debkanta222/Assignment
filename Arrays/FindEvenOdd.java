package ArraysAssignment;

import java.util.Arrays;

public class FindEvenOdd {
public static void main(String args[]){  
int a[]={3,8,7,4,9,2};//initializing the array
System.out.println("Original Array : "+Arrays.toString(a));
System.out.println("Odd Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2!=0){ //logic for odd numbers 
System.out.print(a[i]+" ");  
}  
}  
System.out.println();
System.out.println("Even Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2==0){  //logic for even numbers
System.out.print(a[i]+" ");  
}  
}  
}}  