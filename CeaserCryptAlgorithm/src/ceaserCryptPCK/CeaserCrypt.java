package ceaserCryptPCK;
import java.util.Arrays;
import java.util.Scanner;

public class CeaserCrypt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence to crypt / decrypt");
		String textInput = input.nextLine();
		System.out.println("Enter a step number (negative for decrypt)");
		int stepNum = input.nextInt();
		crypt(textInput, stepNum);
		input.close();
	}
	static void crypt(String input, int step) {
		char[] chr = new char[input.length()];
		int[] numValues = new int[chr.length];
		for(int a=0; a<input.length(); a++) {
			chr[a] = input.charAt(a);
		}
		for(int i = 0; i<chr.length; i++) {
		numValues[i] = (int)chr[i];
		numValues[i] = numValues[i] + step;
		chr[i] = (char)numValues[i];
		}
		print(chr, chr.length);
	}
	static void print(char[] chr, int length){
		String output ="";
		for(int i=0; i<length;i++) {
			output+=chr[i];
		}
		System.out.println("The coded/decoded string is: \n" +output);
	}
}
