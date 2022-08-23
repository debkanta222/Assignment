package Assi5gnment;
import java.util.*;
public class QuadraticEq {

	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in); 
				System.out.print("A: "); 
				int a = scan.nextInt(); 
				System.out.print("B: "); 
				int b = scan.nextInt(); 
				System.out.print("C: "); 
				int c = scan.nextInt(); 
				System.out.println((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a)); 
				System.out.println((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a)); 
			} 

	}

