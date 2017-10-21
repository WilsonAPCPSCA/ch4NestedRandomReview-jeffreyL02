package Homework;
import java.util.Scanner;
public class CoinFlip {
	public static void main(String[] args){
		System.out.println("How many times should the coin be flipped?");
		Scanner in = new Scanner(System.in);
		int flips = in.nextInt();
		int tails = 0;
		int heads = 0;
		for(int i = 0; i < flips; i++){
			double random = Math.random();
			if(random < 0.49){
				System.out.print("T");
				random = 0;
				tails++;
			}
			else{
				System.out.print("H");
				random = 0;
				heads++;
			}
		}
		System.out.println("\n"+ "There were " + heads + " heads and " + tails + " tails");
	}
}