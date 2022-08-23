package Assi5gnment;
import java.util.*;
public class GreatestNumberCheck {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number : ");
		a=scan.nextInt();
		System.out.println("enter the second number : ");
		b=scan.nextInt();
		System.out.println("enter the third number : ");
		c=scan.nextInt();
		if (a>b&&a>c) {
			System.out.println("the greatest number is:"+ a);
		}
		else if(b>a&&b>c) {
			System.out.println("the greatest num is :"+b);
		}
		else if(c>a&&c>2) {
			System.out.println("the greatest is :"+c);
		}
		else {
			System.out.println("all numbers are equal");
		}

	}

}
