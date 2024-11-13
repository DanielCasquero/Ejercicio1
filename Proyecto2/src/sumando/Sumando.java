package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Numero 1:");
		int num1 = input.nextInt();
		System.out.println("Numero 2:");
		int num2 = input.nextInt();
		
		System.out.println(num1 + num2);
		input.close();
		
		
		
		
	}

}
