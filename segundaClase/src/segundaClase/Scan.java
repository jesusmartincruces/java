package segundaClase;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		sc.nextLine();
		String texto = sc.nextLine();
		System.out.println("Has introducido los números " + numero1 + " y " + numero2 + " y el texto:" + texto);

	}

}
