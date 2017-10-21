package Homework;
import java.util.Scanner;
import java.util.ArrayList;
public class Histogram {
	public static void main(String[] args) {
		System.out.println("How many times should the dice be tossed");
		Scanner in = new Scanner(System.in);
		int tosses = in.nextInt();
		System.out.println("Here is the sequence of the sums for each toss");
		int random1;
		int random2;
		int random3;
		ArrayList<Integer> histogram = new ArrayList<Integer>();
		for(int j = 0; j < tosses; j++){
			random1 = ((int)(Math.random() * 6) + 1);
			random2 = ((int)(Math.random() * 6) + 1);
			random3 = random1 + random2;
			System.out.print(random3 + " ");
			histogram.add(random3);
		}
		
		System.out.print("\n" + "2: ");
		for(int roll : histogram){
			if(roll == 2) {
				System.out.print("*");
			}
		}
		System.out.print("\n" + "3: ");
		for(int roll : histogram){
			if(roll == 3) {
				System.out.print("*");
			}
		}
		System.out.print("\n" + "4: ");
		for(int roll : histogram){
			if(roll == 4) {
				System.out.print("*");
			}
		}
		System.out.print("\n" + "5: ");
		for(int roll : histogram){
			if(roll == 5) {
				System.out.print("*");
			}
		}
		System.out.print("\n" + "6: ");
		for(int roll : histogram){
			if(roll == 6) {
				System.out.print("*");
			}
		}
		System.out.print("\n" + "7: ");
		for(int roll : histogram){
			if(roll == 7) {
				System.out.print("*");
			}
		}
		System.out.print("\n" + "8: ");
		for(int roll : histogram){
			if(roll == 8) {
				System.out.print("*");
			}
		}
		System.out.print("\n" + "9: ");
		for(int roll : histogram){
			if(roll == 9) {
				System.out.print("*");
			}
		}
		System.out.print("\n" + "10: ");
		for(int roll : histogram){
			if(roll == 10) {
				System.out.print("*");
			}
		}
		System.out.print("\n" + "11: ");
		for(int roll : histogram){
			if(roll == 11) {
				System.out.print("*");
			}
		}
		System.out.print("\n" + "12: ");
		for(int roll : histogram){
			if(roll == 12) {
				System.out.print("*");
			}
		}
	}
}