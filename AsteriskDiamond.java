package Homework;
import java.util.Scanner;
public class AsteriskDiamond {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the side length");
		int side = in.nextInt();
		for(int i = 1; i <= side * 2; i += 2) {	
				for(int n = 1; n < side - (i/2); n++){
					System.out.print(" ");
				}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = (side * 2) - 3; i >= 1; i -= 2) {
			for(int n = 1; n < side - (i/2); n++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}