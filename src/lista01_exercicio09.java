import java.util.Scanner;

public class lista01_exercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escreva a temperatura em Fahrenheit: ");
		int f = input.nextInt();
		
		int g = 5 * ((f - 32 ) / 9);
		
		System.out.printf("A temperatura em graus Celsius é: %sº", g);
		
		
	}

}

//tranformar fahrenheit em graus celsius