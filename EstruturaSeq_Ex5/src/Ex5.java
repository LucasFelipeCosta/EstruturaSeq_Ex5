import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		double m, cm;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor em metros ");
		m = teclado.nextDouble();
		
		cm = m*100;
		
		System.out.println("O valor em centimetros e: " + cm);
		
		teclado.close();
	}

}
