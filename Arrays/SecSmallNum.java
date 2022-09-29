package ArraysAssignment;

public class SecSmallNum {
public static int getSecondSmallest(int[] a, int total){  
int n;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    n = a[i];  
                    a[i] = a[j];  
                    a[j] = n;  
                }  
            }  
        }  
       return a[1];//2nd element because index starts from 0  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
System.out.println("Second smallest: "+getSecondSmallest(a,6));  
System.out.println("Second smallest: "+getSecondSmallest(b,7));  
}}  